package com.xatalvix.ExAlishev;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) throws IOException {
        String separator = File.separator;
        String path = "test.txt";

        File file = new File(path);
        Scanner scanner = new Scanner(file);
        String fileContent = "";
        while (scanner.hasNextLine()) {
            //System.out.println(scanner.nextLine());
            fileContent = fileContent.concat(scanner.nextLine() + "\n");
        }

        FileWriter writer = new FileWriter("test2.txt");
        writer.write(fileContent);
        scanner.close();
        writer.close();
    }
}
