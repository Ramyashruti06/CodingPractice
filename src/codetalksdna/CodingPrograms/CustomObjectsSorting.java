package codetalksdna.CodingPrograms;

import java.util.ArrayList;
import java.util.Collections;

class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age);
    }
}

public class CustomObjectsSorting {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25));
        people.add(new Person("Bob", 30));
        people.add(new Person("Charlie", 20));

        System.out.println("People before sorting:");
        for (Person person : people) {
            System.out.println(person.getName() + " - " + person.getAge());
        }

        Collections.sort(people);

        System.out.println("\nPeople after sorting by age:");
        for (Person person : people) {
            System.out.println(person.getName() + " - " + person.getAge());
        }
    }
}
