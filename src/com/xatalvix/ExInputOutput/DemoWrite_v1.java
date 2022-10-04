package com.xatalvix.ExInputOutput;

import java.io.FileWriter;
import java.io.IOException;

public class DemoWrite_v1 {
    public static void main(String[] args) throws IOException {
        String path = "test_2.txt";
        FileWriter writer = new FileWriter(path);
        String text = "Привет Елена.";
        writer.write(text);
        // запись по символам
        writer.append('\n');
        writer.append('Е');
        writer.flush();
    }
}
