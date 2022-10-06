package com.xatalvix.ExURL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class DemoURL_v3 {
    public static void main(String[] args) throws IOException {
        String urlString1 = "https://www.gnu.org/";
        URL url1 = new URL(urlString1);
        System.out.println("/***** File content (URL) *****/n");
        System.out.println(URLReader(url1));
    }

    public static String URLReader(URL url) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        String inputLine;
        InputStream inputStream = url.openStream();
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            while((inputLine = reader.readLine()) != null) {
                stringBuilder.append(inputLine).append(System.lineSeparator());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            inputStream.close();
        }
        return stringBuilder.toString();
    }
}
