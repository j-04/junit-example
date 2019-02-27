package com;

import static com.Sex.MALE;
import static com.Sex.FEMALE;

public class Main {
    public static void main(String[] args) {
        new User("Евгений", 35, MALE);
        new User("Марина", 34, FEMALE);
        new User("Алина", 7, FEMALE);

        System.out.println("All users:");
        User.getAllUsers().forEach(System.out::println);
        System.out.println("All users: MALE");
        User.getAllUsers(MALE).forEach(System.out::println);
        System.out.println("All users: FEMALE");
        User.getAllUsers(FEMALE).forEach(System.out::println);
        System.out.println("==========================================");
        System.out.println("Всех пользователей: " + User.getHowManyUsers());
        System.out.println("Всех пользователей MALE: " + User.getHowManyUsers(MALE));
        System.out.println("Всех пользователей FEMALE: " + User.getHowManyUsers(FEMALE));
        System.out.println("==========================================");
        System.out.println("Общий возраст всех пользователей: " + User.getAllAgeUsers());
        System.out.println("Общий возраст всех пользователей MALE: " + User.getAllAgeUsers(MALE));
        System.out.println("Общий возраст всех пользователей FEMALE: " + User.getAllAgeUsers(FEMALE));
        System.out.println("==========================================");
        System.out.println("Средний возраст всех пользователей: " + User.getAverageAgeOfAllUsers());
        System.out.println("Средний возраст всех пользователей MALE: " + User.getAverageAgeOfAllUsers(MALE));
        System.out.println("Средний возраст всех пользователей FEMALE: " + User.getAverageAgeOfAllUsers(FEMALE));
        System.out.println("==========================================");
    }
}
