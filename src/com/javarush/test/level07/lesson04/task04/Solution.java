package com.javarush.test.level07.lesson04.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arrayInt = new int[10];
        for (int i = 0; i < arrayInt.length; i++)
        {
            arrayInt[i] = Integer.parseInt(reader.readLine());
        }
        arrayInt = change(arrayInt);

        for (int i = 0; i < arrayInt.length; i++)
        {
            System.out.println(arrayInt[i]);
        }

    }

    public static int[] change(int[] arrayInt){
        int[] temp = new int[arrayInt.length];
        for (int i = 0; i < arrayInt.length; i++)
        {
            temp[i] = arrayInt[arrayInt.length - 1 - i];
        }
        return temp;
    }
}
