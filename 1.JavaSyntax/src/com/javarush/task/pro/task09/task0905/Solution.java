package com.javarush.task.pro.task09.task0905;

/* 
Восьмеричный конвертер
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = 21;
        System.out.println("Десятичное число " + decimalNumber + " равно восьмеричному числу " + toOctal(decimalNumber));
        int octalNumber = 25;
        System.out.println("Восьмеричное число " + octalNumber + " равно десятичному числу " + toDecimal(octalNumber));
    }

    public static int toOctal(int decimalNumber) {
        //напишите тут ваш код
        if (decimalNumber <= 0) {
            return 0;
        }
        int tmpDecimal = decimalNumber;
        int tmpOctal = 0;
        for (int i = 0; tmpDecimal != 0; i++) {
            tmpOctal = tmpOctal + (tmpDecimal % 8) * (int) Math.pow(10, i);
            tmpDecimal = tmpDecimal / 8;
        }
        return tmpOctal;
    }

    public static int toDecimal(int octalNumber) {
        //напишите тут ваш код
        if (octalNumber <= 0) {
            return 0;
        }
        int tmpOctal = octalNumber;
        int tmpDecimal = 0;
        for (int i = 0; tmpOctal != 0; i++) {
            tmpDecimal = tmpDecimal + (tmpOctal % 10) * (int) Math.pow(8, i);
            tmpOctal = tmpOctal / 10;
        }
        return tmpDecimal;
    }
}
