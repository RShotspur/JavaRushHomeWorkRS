package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int one = Integer.parseInt(reader.readLine());
        int two = Integer.parseInt(reader.readLine());
        int three = Integer.parseInt(reader.readLine());
        int four = Integer.parseInt(reader.readLine());
        System.out.println(maximum(maximum(one, two), maximum(three, four)));
    }

    public static int maximum(int one, int two){
        if (one > two){
            return one;
        }
        else {
            return two;
        }
    }
}
