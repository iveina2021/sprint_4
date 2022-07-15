package ru.yandex.praktikum.card;

public class Account {
    private static final String NAME_WITH_ONE_SPACE_PATTERN = "^[^\\s]+\\s[^\\s]+$";

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        if (name.length() >= 3 && name.length() <= 19 && name.matches(NAME_WITH_ONE_SPACE_PATTERN)) {
            return true;
        } else {
            return false;
        }
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
    }

}

