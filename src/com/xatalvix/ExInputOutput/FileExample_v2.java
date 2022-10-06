package com.xatalvix.ExInputOutput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileExample_v2 {
    public static void main(String[] args) throws IOException {
        String path = "Equilibrium.txt";
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        // BufferedReader реализует Шаблон декоратора.
        // BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/input.txt")), 16384);
        // BufferedReader reader = Files.newBufferedReader(Paths.get("src/main/resources/input.txt"))
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        // StringBuffer синхронизированный и потокобезопасный.
        // StringBuilder не потокобезопасный. Работает быстрее в однопоточных приложениях.
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            stringBuilder.append(line).append("\n");
        }
        System.out.println(stringBuilder);
    }
}
