package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[3];

        for (int i = 0; i < 3; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < 3; i++)
        {
            for (int j = i; j < 3; j++)
            {
                if (array[i] < array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            System.out.println(array[i]);
        }


    }
}
