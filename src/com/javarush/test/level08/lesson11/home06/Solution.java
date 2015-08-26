package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Human humanChild1 = new Human("Child1", true, 10, new ArrayList<Human>());
        Human humanChild2 = new Human("Child2", true, 11, new ArrayList<Human>());
        Human humanChild3 = new Human("Child3", true, 12, new ArrayList<Human>());
        Human humanFather = new Human("Father", true, 38, new ArrayList<Human>(Arrays.asList(humanChild1, humanChild2, humanChild3)));
        Human humanMother = new Human("Mother", false, 35, new ArrayList<Human>(Arrays.asList(humanChild1, humanChild2, humanChild3)));
        Human humanGrandPaFathers = new Human("GrandPaFathers", true, 70, new ArrayList<Human>(Arrays.asList(humanFather)));
        Human humanGrandMaFathers = new Human("GrandMaFathers", false, 65, new ArrayList<Human>(Arrays.asList(humanFather)));
        Human humanGrandPaMothers = new Human("GrandPaMothers", true, 70, new ArrayList<Human>(Arrays.asList(humanMother)));
        Human humanGrandMaMothers = new Human("GrandMaMothers", true, 68, new ArrayList<Human>(Arrays.asList(humanMother)));

        System.out.println(humanGrandPaFathers);
        System.out.println(humanGrandMaFathers);
        System.out.println(humanGrandPaMothers);
        System.out.println(humanGrandMaMothers);
        System.out.println(humanFather);
        System.out.println(humanMother);
        System.out.println(humanChild1);
        System.out.println(humanChild2);
        System.out.println(humanChild3);

    }



    public static class Human
    {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
