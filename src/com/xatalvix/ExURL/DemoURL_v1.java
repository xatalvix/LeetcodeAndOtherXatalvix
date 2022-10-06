package com.xatalvix.ExURL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class DemoURL_v1 {
    public static void main(String[] args) throws IOException {
        String urlString1 = "https://www.gnu.org/";
        URL url1 = new URL(urlString1);
        System.out.println("URL1: " + url1.toString());

        BufferedReader reader = new BufferedReader(new InputStreamReader(url1.openStream()));
        String inputLine;
        System.out.println("/***** File content (URL1) *****/n");
        while((inputLine = reader.readLine()) != null) {
            System.out.println(inputLine);
        }
        reader.close();
    }
}
