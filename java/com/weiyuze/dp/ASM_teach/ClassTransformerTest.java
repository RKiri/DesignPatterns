package com.weiyuze.dp.ASM_teach;

import org.objectweb.asm.*;

import java.io.File;
import java.io.FileOutputStream;

import static org.objectweb.asm.Opcodes.*;

public class ClassTransformerTest {
    public static void main(String[] args) throws Exception {
        ClassReader cr = new ClassReader(
                ClassPrinter.class.getClassLoader().getResourceAsStream("com/weiyuze/dp/ASM_teach/Tank.class"));

        ClassWriter cw = new ClassWriter(0);
        ClassVisitor cv = new ClassVisitor(ASM4, cw) {
            @Override
            public MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions) {
                MethodVisitor mv = super.visitMethod(access, name, descriptor, signature, exceptions);
                //return mv;
                return new MethodVisitor(ASM4, mv) {
                    @Override
                    public void visitCode() {
                        visitMethodInsn(INVOKESTATIC, "com/weiyuze/dp/ASM_teach/TimeProxy","before", "()V", false);
                        super.visitCode();
                    }
                };
            }
        };

        cr.accept(cw, 0);
        byte[] b2 = cw.toByteArray();

        MyClassLoader cl = new MyClassLoader();
        //Class c = cl.loadClass("com.weiyuze.dp.ASM_teach.Tank");
        cl.loadClass("com.weiyuze.dp.ASM_teach.TimeProxy");
        Class c2 = cl.defineClass("com.weiyuze.dp.ASM_teach.Tank", b2);
        c2.getConstructor().newInstance();


        String path = (String)System.getProperties().get("user.dir");
        File f = new File(path + "/com/weiyuze/dp/ASM_teach/");
        f.mkdirs();

        FileOutputStream fos = new FileOutputStream(new File(path + "/com/weiyuze/dp/ASM_teach/Tank_0.class"));
        fos.write(b2);
        fos.flush();
        fos.close();

    }
}
