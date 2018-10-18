package com.company;

import java.util.ArrayList;

import java.util.Random;

public class Main {

    public static void main(String[] args) {


        ArrayList<Person> allPerson = new ArrayList<>();


        allPerson.add(new Person("Sarah"));
        allPerson.add(new Person("Simon"));
        allPerson.add(new Person("Michael"));
        allPerson.add(new Person("King"));
        allPerson.add(new Person("Victor"));
        allPerson.add(new Person("Lisa"));


        ArrayList<String> activites = new ArrayList<>();
        activites.add(" visited ");
        activites.add(" played chess with ");
        activites.add(" saw a movie with ");
        activites.add(" went to a meet up with ");
        activites.add(" tipped over a glass during a date with ");


        String[] dates = {" visited ", " played chess with ", " saw a movie with ", " went to a meetup with ",
                " tipped over a glass during a date with "};


        for (int i = 0; i < 10; i++) {

            Random rand = new Random();
            Person person1 = allPerson.get(rand.nextInt(allPerson.size()));
            Person person2 = allPerson.get(rand.nextInt(allPerson.size()));
            String word = activites.get(rand.nextInt(activites.size()));

            if (person1 == person2) {
                System.out.println(person1.getName() + " is free on Saturday night");
            } else {
                System.out.println(person1.getName() + " Asked " + person2.getName() + " out, and " + person2.getName() + " accepted");
                for (int j = 0; j < word.length(); j++) {

                    System.out.println(person1.getName() + word + person2.getName());
                    activites.remove(word);
                }
                System.out.println();

            }
        }

    }

}
