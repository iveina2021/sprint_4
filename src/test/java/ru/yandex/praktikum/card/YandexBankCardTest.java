package ru.yandex.praktikum.card;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class YandexBankCardTest {

    @Test
    public void checkNameLengthIsCorrect() {
        Account account = new Account("Тимоти Шаламе");
        boolean result = account.checkNameToEmboss();
        Assertions.assertThat(result).isTrue();
    }

    @Test
    public void checkNameLengthShouldHaveMoreThan3Symbols() {
        Account account = new Account("Ти");
        boolean result = account.checkNameToEmboss();
        Assertions.assertThat(result).isFalse();
    }

    @Test
    public void checkNameLengthShouldHaveLessThan19Symbols() {
        Account account = new Account("Тимоти Шаламешаламешаламе");
        boolean result = account.checkNameToEmboss();
        Assertions.assertThat(result).isFalse();
    }

    @Test
    public void checkNameHasOnlyOneWhitespaceBetweenNameAndSurname() {
        Account account = new Account("Тимоти Шаламе");
        boolean result = account.checkNameToEmboss();
        Assertions.assertThat(result).isTrue();
    }

    @Test
    public void checkNameHasMoreThanOneWhitespaceBetweenNameAndSurname() {
        Account account = new Account("Тимоти  Шаламе");
        boolean result = account.checkNameToEmboss();
        Assertions.assertThat(result).isFalse();
    }

    @Test
    public void checkNameHasNotWhitespaceBetweenNameAndSurname() {
        Account account = new Account("ТимотиШаламе");
        boolean result = account.checkNameToEmboss();
        Assertions.assertThat(result).isFalse();
    }

    @Test
    public void checkNameHasWhitespaceBeforeName() {
        Account account = new Account("  Тимоти Шаламе");
        boolean result = account.checkNameToEmboss();
        Assertions.assertThat(result).isFalse();
    }

    @Test
    public void checkNameHasWhitespaceAfterName() {
        Account account = new Account("Тимоти Шаламе  ");
        boolean result = account.checkNameToEmboss();
        Assertions.assertThat(result).isFalse();
    }

}
