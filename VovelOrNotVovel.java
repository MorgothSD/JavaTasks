package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();

        StringBuilder bld = new StringBuilder(input);
        ArrayList<Character> vov = new ArrayList<Character>();
        ArrayList<Character> notvov = new ArrayList<Character>();

        for (int i = 0; i < bld.length(); i++) {
            if (isVowel(bld.charAt(i))) vov.add(bld.charAt(i));
            else
            {
                if (bld.charAt(i)!=' ') notvov.add(bld.charAt(i));
            }
        }

        for (Character chars : vov) {
            System.out.print(chars + " ");
        }
        System.out.print("\n");

        for (Character chars : notvov) {
            System.out.print(chars + " ");
        }
        System.out.print("\n");

    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char vowel : vowels) {  // ищем среди массива гласных
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}
