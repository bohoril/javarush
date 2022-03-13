package com.javarush.task.pro.task15.task1506;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/* 
Фейсконтроль
*/

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            List<String> allLines = Files.readAllLines(Paths.get(scanner.nextLine()));
            for (int i = 0; i < allLines.size(); i++) {
                char[] chars = allLines.get(i).toCharArray();
                for (char element : chars) {
                    if (element != '.' && element != ',' && element != ' ') {
                        System.out.print(element);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

