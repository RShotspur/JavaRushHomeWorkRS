package com.javarush.test.level07.lesson09.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* Слово «именно»
1. Создай список из слов «мама», «мыла», «раму».
2. После каждого слова вставь в список строку, содержащую слово «именно».
3. Используя цикл for вывести результат на экран, каждый элемент списка с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        list.add("мама");
        list.add("мыла");
        list.add("раму");
        list = adSomeWord(list);
        for (String aList : list){
            System.out.println(aList);
        }


    }

    public static ArrayList<String> adSomeWord(ArrayList<String> list){
        ArrayList<String> temp = new ArrayList<String>();
        for (String aList : list){
            temp.add(aList);
            temp.add("именно");
        }
        return temp;
    }
}
