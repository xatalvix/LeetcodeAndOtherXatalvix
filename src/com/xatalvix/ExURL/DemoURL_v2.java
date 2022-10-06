package com.xatalvix.ExURL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class DemoURL_v2 {
    public static void main(String[] args) throws IOException {
        String urlString1 = "https://www.gnu.org/";
        URL url1 = new URL(urlString1);
        System.out.println("URL1: " + url1.toString());

        String inputLine;
        System.out.println("/***** File content (URL1) *****/n");

        InputStream inputStream = url1.openStream();
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            while((inputLine = reader.readLine()) != null) {
                System.out.println(inputLine);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            inputStream.close();
        }
    }
}
