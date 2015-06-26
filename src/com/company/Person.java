package com.company;

enum Position {DIRECTOR, DEVELOPER, QA}

public class Person {

    private String name;
    private int age;
    final String COMPANY_NAME = "Microsoft";
    public Position position;



    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPosition(Position position) { this.position = position; }

    public Position getPosition() { return this.position; }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (!name.equals(person.name)) return false;
        return COMPANY_NAME.equals(person.COMPANY_NAME);

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        result = 31 * result + COMPANY_NAME.hashCode();
        return result;
    }
}


