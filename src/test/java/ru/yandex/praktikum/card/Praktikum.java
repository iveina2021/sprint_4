package ru.yandex.praktikum.card;

public class Praktikum {

    public static void main(String[] args) {
        String name = args[0];
        Account account = new Account(name);
        account.checkNameToEmboss();
    }
}

