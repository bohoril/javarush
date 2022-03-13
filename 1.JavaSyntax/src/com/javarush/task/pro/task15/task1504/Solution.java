package com.javarush.task.pro.task15.task1504;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/* 
Перепутанные байты
*/

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
             InputStream inputStream = Files.newInputStream(Paths.get(scanner.nextLine()));
             OutputStream outputStream = Files.newOutputStream(Paths.get(scanner.nextLine()))
        ) {
            byte[] buffer = new byte[65536]; // 64 Kb
            while (inputStream.available() > 0) {
                int real = inputStream.read(buffer);
                for (int i = 0; i < real; i += 2) {
                    if (i != real - 1) {
                        byte temp = buffer[i];
                        buffer[i] = buffer[i + 1];
                        buffer[i + 1] = temp;
                    }
                }
                outputStream.write(buffer, 0, real);
            }
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}

