package org.example;

import com.google.gson.Gson;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Main {
    public static void main(String[] args) {
        // Создание объекта класса Person
        Person person = new Person("Евгений", "Соловьев", 35);

        // Сериализация объекта в формат JSON
        Gson gson = new Gson();
        String json = gson.toJson(person);
        System.out.println("Сериализованный объект: " + json);

        // Десериализация JSON в объект Person
        Person deserializedPerson = gson.fromJson(json, Person.class);
        System.out.println("Десериализованный объект: " + deserializedPerson);
    }
}