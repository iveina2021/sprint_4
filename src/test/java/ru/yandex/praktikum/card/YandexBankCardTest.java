package ru.yandex.praktikum.card;

import org.assertj.core.api.AbstractBooleanAssert;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class YandexBankCardTest {

    private String name;
    private boolean expected;

    public YandexBankCardTest(String name, boolean expected) {
        this.name = name;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "{index}: Name {0} should be {1}")
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{
                {"Тимоти Шаламе", true}, // checkNameLengthIsCorrect, checkNameHasOnlyOneWhitespaceBetweenNameAndSurname
                {"Ти", false}, // checkNameLengthShouldHaveMoreThan3Symbols
                {"Тимоти Шаламешаламешаламе", false}, // checkNameLengthShouldHaveLessThan19Symbols
                {"Тимоти  Шаламе", false}, // checkNameHasMoreThanOneWhitespaceBetweenNameAndSurname
                {"ТимотиШаламе", false}, // checkNameHasNotWhitespaceBetweenNameAndSurname
                {"  Тимоти Шаламе", false}, // checkNameHasWhitespaceBeforeName
                {"Тимоти Шаламе  ", false}, // checkNameHasWhitespaceAfterName
                {null, false}//
        };
        return Arrays.asList(data);
    }

    @Test
    public void cardTest() {
       Account account = new Account(name);
        boolean actual = account.checkNameToEmboss();
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
