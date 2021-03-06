package com.javarush.test.level08.lesson08.task05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        for (int i = 0; i < 9; i++)
        {
            map.put("Familia" + i, "Name");
        }
        map.put("Familia10", "Name10");
        return map;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //напишите тут ваш код
        ArrayList<String> tempList = new ArrayList<String>();
        for (Map.Entry<String, String> pair : map.entrySet()){
            int count = 0;
            String tempString = pair.getValue();
            for (Map.Entry<String, String> pair2 : map.entrySet()){
                if(tempString.equals(pair2.getValue())){
                    count++;
                }
            }
            if(count > 1){
                tempList.add(pair.getValue());
            }
        }
        for(String temp : tempList){
            removeItemFromMapByValue(map, temp);
        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
