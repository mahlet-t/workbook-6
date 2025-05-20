package com.pluralsight;
public class Person implements Comparable<Person> {
    protected String firstName;
    protected String lastName;
    protected int age;

    public Person(String firstName, String lastname, int age) {
        this.firstName = firstName;
        this.lastName = lastname;
        this.age = age;
    }



    @Override
    public int compareTo(Person other ) {
        int lastname=this.lastName.compareToIgnoreCase(other.lastName);
        int firstname=this.firstName.compareToIgnoreCase(other.firstName);
        if (lastname!=0) {
            return lastname;
        } else if(firstname!=0) {
            return firstname;

        }

        return Integer.compare(this.age,other.age);



    }
    @Override
    public String toString() {
        return firstName+"|"+lastName+"|"+age;
    }


}
