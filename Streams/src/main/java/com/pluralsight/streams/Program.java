package com.pluralsight.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Jacinto", "Adkins", 18));
        personList.add(new Person("Arlie", "Gregory", 23));
        personList.add(new Person("Cristina", "Sexton", 24));
        personList.add(new Person("Darlene", "Morgan", 22));
        personList.add(new Person("Benita", "Thornton", 43));
        personList.add(new Person("Noble", "Hart", 33));
        personList.add(new Person("Moises", "Mays", 26));
        personList.add(new Person("Geneva", "Barrera", 31));
        personList.add(new Person("Gabrielle", "Blackwell", 29));
        personList.add(new Person("Eugenia", "Beard", 25));

        System.out.println("search by first name");
        String firstName = input.nextLine();
        List<Person> matchList = new ArrayList<>();
        double total = 0;
        double average = total / personList.size();
        Person youngest=personList.get(0);
        Person oldest=personList.get(0);
        for (Person person : personList) {
            if (firstName.equalsIgnoreCase(person.getFirstName())) {
                matchList.add(person);

            }
            total += person.getAge();
            if (person.getAge()<youngest.getAge()){
                youngest=person;

            }
            if (person.getAge()>oldest.getAge()){
                oldest=person;
            }

        }
        System.out.println("Youngest person: "+youngest);
        System.out.println("Oldest person: "+oldest);
        System.out.println(matchList);
        System.out.println("Average age " + average);


    }


}
