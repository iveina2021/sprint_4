package yandexBankCard;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class YandexBankCardTest {

    @Test
    public void checkNameLengthIsCorrect() {
        Account account = new Account("Тимоти Шаламе");
        boolean result = account.checkNameToEmboss();
        Assertions.assertTrue(result);
    }

    @Test
    public void checkNameLengthShouldHaveMoreThan3Symbols() {
        Account account = new Account("Ти");
        boolean result = account.checkNameToEmboss();
        Assertions.assertFalse(result);
    }

    @Test
    public void checkNameLengthShouldHaveLessThan19Symbols() {
        Account account = new Account("Тимоти Шаламешаламешаламе");
        boolean result = account.checkNameToEmboss();
        Assertions.assertFalse(result);
    }

    @Test
    public void checkNameHasOnlyOneWhitespaceBetweenNameAndSurname() {
        Account account = new Account("Тимоти Шаламе");
        boolean result = account.checkNameToEmboss();
        Assertions.assertTrue(result);
    }

    @Test
    public void checkNameHasMoreThanOneWhitespaceBetweenNameAndSurname() {
        Account account = new Account("Тимоти  Шаламе");
        boolean result = account.checkNameToEmboss();
        Assertions.assertFalse(result);
    }

    @Test
    public void checkNameHasNotWhitespaceBetweenNameAndSurname() {
        Account account = new Account("ТимотиШаламе");
        boolean result = account.checkNameToEmboss();
        Assertions.assertFalse(result);
    }

    @Test
    public void checkNameHasWhitespaceBeforeName() {
        Account account = new Account("  Тимоти Шаламе");
        boolean result = account.checkNameToEmboss();
        Assertions.assertFalse(result);
    }

    @Test
    public void checkNameHasWhitespaceAfterName() {
        Account account = new Account("Тимоти Шаламе  ");
        boolean result = account.checkNameToEmboss();
        Assertions.assertFalse(result);
    }

}
