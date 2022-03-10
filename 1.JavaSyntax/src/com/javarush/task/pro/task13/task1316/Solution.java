package com.javarush.task.pro.task13.task1316;

public class Solution {

    public static void main(String[] args) {
        JavarushQuest[] arrayJavarushQuest = JavarushQuest.values();
        for (JavarushQuest quest : arrayJavarushQuest) {
            System.out.println(quest.ordinal());
        }
    }
}
