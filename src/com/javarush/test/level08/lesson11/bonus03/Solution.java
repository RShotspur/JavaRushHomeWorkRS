package com.javarush.test.level08.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Date;

/* Задача по алгоритмам
Задача: Введи с клавиатуры 20 слов и выведи их в алфавитном порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[20];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = "xfgnlcjkncn" + i;
        }
        long date1 = new Date().getTime();
        sort(array);
        long date2 = new Date().getTime();
        System.out.println(date2 - date1);

        for (String x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(String[] array)
    {
        //напишите тут ваш код
//        for (int i=0; i<array.length-1;){
//            int s = i+1;
//            String temp = null;
//            //сначала отправляем первое и второе значение на сверку
//            if(isGreaterThan(array[i], array[s])){
//                temp = array[s];
//                array[s]=array[i];
//                array[i]=temp;
//                if (i>0) i--;
//            }
//            else i++;
//
//        }
        String temp;
        for (int i = 0; i < array.length; i++)
        {
            for (int j = i; j < array.length; j++)
            {
                if(isGreaterThan(array[i], array[j])){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b)
    {
        return a.compareTo(b) > 0;
    }
}
