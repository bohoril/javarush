package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("Владислав Николаев", 4.0);
        grades.put("Марина Тавровская", 5.0);
        grades.put("Алексей Николаев", 4.0);
        grades.put("Михаил Кашечкин", 5.0);
        grades.put("Илья Айдашкин", 3.5);
    }
}
