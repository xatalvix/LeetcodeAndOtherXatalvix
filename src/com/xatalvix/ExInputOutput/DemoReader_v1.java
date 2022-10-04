package com.xatalvix.ExInputOutput;

import java.io.*;

public class DemoReader_v1 {
    public static void main(String[] args) throws IOException {
        String path = "test_2.txt";
        FileReader reader1 = new FileReader(path);
        int c;
        while ((c = reader1.read()) != -1) {
            System.out.print((char) c);
        }
        System.out.println();

        File file = new File(path);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

        BufferedReader reader2 = new BufferedReader(new FileReader(file));
        reader2.lines().forEach(System.out::println);
    }
}
