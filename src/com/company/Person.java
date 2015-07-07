package com.company;

public class Person {

    private final String firstName;    //required
    private final String lastName;    //required
    private final int age;    //optional
    private final String phone;    //optional
    private final String address;    //optional

    private Person(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;


    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }


    public static class Builder {
        private String firstName;
        private String lastName;
        private int age;
        private String phone;
        private String address;

        public Builder() {

        }

        public Builder(Person original) {
            this.firstName = original.firstName;
            this.lastName = original.lastName;
            this.age = original.age;
            this.phone = original.phone;
            this.address = original.address;


        }

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;

        }

        public Person build() {
            return new Person(this);
        }

    }
}



