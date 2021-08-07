package com.weiyuze.dp.ASM;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import static org.objectweb.asm.Opcodes.ASM4;
import static org.objectweb.asm.Opcodes.INVOKESTATIC;

public class ClassTransformerTest {
    public static void main(String[] args) throws IOException {
        ClassReader cr = new ClassReader(
                ClassPrinter.class.getClassLoader().getResourceAsStream("com/weiyuze/dp/ASM/Tank.class"));
        ClassWriter cw = new ClassWriter(0);
        ClassVisitor cv = new ClassVisitor(ASM4,cw) {
            @Override
            public MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions) {
                MethodVisitor mv = super.visitMethod(access,name,descriptor,signature,exceptions);
                return new MethodVisitor(ASM4,mv) {
                    @Override
                    public void visitCode() {
                        visitMethodInsn(INVOKESTATIC,"com/weiyuze/dp/ASM/TimeProxy","before","()V",false);
                        super.visitCode();
                    }
                };
            }
        };


        cr.accept(cv,0);
        byte[] b = cw.toByteArray();

        String path = (String) System.getProperties().get("user.dir");
        File f = new File(path+"/com/weiyuze/dp/ASM/");
        f.mkdirs();

        FileOutputStream fos = new FileOutputStream(new File(path+"/com/weiyuze/dp/ASM/Test_1.class"));
        fos.write(b);
        fos.flush();
        fos.close();

    }
}
