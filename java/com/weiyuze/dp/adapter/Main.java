package com.weiyuze.dp.adapter;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("d:/test.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        String line = br.readLine();
        if (line != null && !line.equals("")) {
            System.out.println(line);
        }
        br.close();
    }
}
