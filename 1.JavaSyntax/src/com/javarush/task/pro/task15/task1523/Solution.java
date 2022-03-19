package com.javarush.task.pro.task15.task1523;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

/* 
Получение информации по API
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://httpbin.org/post");
        URLConnection connection = url.openConnection();
        connection.setDoOutput(true);

        try (OutputStream output = connection.getOutputStream();
             PrintStream sender = new PrintStream(output);
             InputStream input = connection.getInputStream();
             BufferedReader reader = new BufferedReader(new InputStreamReader(input));) {
            sender.println("Hello Vlad!");
            while (reader.ready()) {
                System.out.println(reader.readLine());
            }
        }
    }
}

