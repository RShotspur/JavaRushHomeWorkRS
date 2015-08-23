package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Human humanGrandPaFathers = new Human("PaName", true, 70, null, null);
        Human humanGrandMaFathers = new Human("MaName", false, 70, null, null);
        Human humanGrandPaMothers = new Human("PaName", true, 65, null, null);
        Human humanGrandMaMothers = new Human("MaName", false, 65, null, null);
        Human humanFather = new Human("Pa", true, 40, humanGrandPaFathers, humanGrandMaFathers);
        Human humanMother = new Human("Ma", false, 35, humanGrandPaMothers, humanGrandMaMothers);
        Human humanSon1 = new Human("Ma", true, 15, humanFather, humanMother);
        Human humanSon2 = new Human("Ma", true, 10, humanFather, humanMother);
        Human humanSon3 = new Human("Ma", true, 5, humanFather, humanMother);
        System.out.println(humanGrandPaFathers);
        System.out.println(humanGrandMaFathers);
        System.out.println(humanGrandPaMothers);
        System.out.println(humanGrandMaMothers);
        System.out.println(humanFather);
        System.out.println(humanMother);
        System.out.println(humanSon1);
        System.out.println(humanSon2);
        System.out.println(humanSon3);

    }

    public static class Human
    {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
