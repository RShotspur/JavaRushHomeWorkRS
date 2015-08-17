package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number1 = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());
        int number3 = Integer.parseInt(reader.readLine());

        {
            if((number1 > number2) && (number1 < number3)){
                System.out.println(number1);
            }
            else if((number2 > number3) && (number2 < number1)){
                System.out.println(number2);
            }
            else if((number3 > number2) && (number3 < number1)){
                System.out.println(number3);
            }
        }


    }
}
