package com.javarush.test.level08.lesson08.task04;

import java.util.*;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static void main(String[] args)
    {
        HashMap<String, Date> map = createMap();
        removeAllSummerPeople(map);
        System.out.println(map.size());
    }
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Stallone1", new Date("MAY 1 1981"));
        map.put("Stallone2", new Date("DECEMBER 1 1982"));
        map.put("Stallone3", new Date("JUNE 1 1983"));
        map.put("Stallone4", new Date("MARCH 1 1984"));
        map.put("Stallone5", new Date("JUNE 1 1985"));
        map.put("Stallone6", new Date("JUNE 1 1986"));
        map.put("Stallone7", new Date("JUNE 1 1987"));
        map.put("Stallone8", new Date("JUNE 1 1988"));
        map.put("Stallone9", new Date("JUNE 1 1989"));

        //напишите тут ваш код
        return map;


    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        //напишите тут ваш код
        Date data1 = new Date();
        Date data2 = new Date();
        Date data3 = new Date();
        data1.setMonth(05);
        data2.setMonth(06);
        data3.setMonth(07);
        ArrayList<String> temp = new ArrayList<String>();
        for (Map.Entry<String, Date> pair : map.entrySet()){
            if ((pair.getValue().getMonth() == data1.getMonth()) || (pair.getValue().getMonth() == data2.getMonth()) || (pair.getValue().getMonth() == data3.getMonth()) ){
                temp.add(pair.getKey());
            }
        }
        for (String aList : temp){
            map.remove(aList);
        }


    }
}
