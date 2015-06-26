package com.company;

public class Main {

    public static void main(String[] args) {

        Person pers1 = new Person();
        pers1.setName("Maxim");
        pers1.setAge(29);
        pers1.setPosition(Position.DEVELOPER);




        Person pers2 = new Person();
        pers2.setName("Vasiliy");
        pers2.setAge(30);
        pers2.setPosition(Position.QA);

        if (pers1.equals(pers2))
            System.out.println("Объекты равны");
        else
            System.out.println("Объекты не равны");


        if (pers1.hashCode()==pers2.hashCode())
            System.out.println("Хеш коды равны");
        else
            System.out.println("Хеш коды не равны");


        if (pers1==pers2)
            System.out.println("Cсылки равны");
        else
            System.out.println("Ссылки не равны");

    }






}
