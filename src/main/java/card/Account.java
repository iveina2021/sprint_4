package card;

public class Account {
    private static final String ACCOUNT_NAME_PATTERN = "^(?=.{3,19}$)[^\\s]+\\s[^\\s]+$";

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        return name != null && name.matches(ACCOUNT_NAME_PATTERN);
    }
}
