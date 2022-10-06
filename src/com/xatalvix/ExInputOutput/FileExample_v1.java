package com.xatalvix.ExInputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileExample_v1 {
    public static void main(String[] args) {
        //Equilibrium.txt
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader br = Files.newBufferedReader(Paths.get("Equilibrium.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                stringBuilder.append(line).append("\n");
            }
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
        System.out.println(stringBuilder);
    }
}
