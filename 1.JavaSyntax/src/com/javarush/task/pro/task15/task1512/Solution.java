package com.javarush.task.pro.task15.task1512;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

/* 
Задом наперед
*/

public class Solution {
    public static ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    public static PrintStream stream = new PrintStream(outputStream);

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder(inputString);
        String reverse = stringBuilder.reverse().toString();
        printSomething(reverse);
        String result = outputStream.toString();
        System.out.print(result);
    }

    public static void printSomething(String str) {
        stream.print(str);
    }
}