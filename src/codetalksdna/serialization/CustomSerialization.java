/*package codetalksdna.serialization;

import com.google.gson.Gson;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String serialize() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }

    public static Person deSerialize(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, Person.class);
    }
}

public class CustomSerialization {
    public static void main(String[] args) {
        Person person = new Person("Nitesh", 28);
        String serialized = person.serialize();
        System.out.println(serialized);

        Person deSerialized = person.deSerialize(serialized);
        System.out.println(deSerialized);

        System.out.println(deSerialized.getAge());
        System.out.println(deSerialized.getName());
    }
}*/
