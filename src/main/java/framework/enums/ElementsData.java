package framework.enums;

public enum ElementsData {
    USER_NAME("Juanito Pablo Rearte"),
    USER_EMAIL("gatitajugosa69@gmail.com"),
    CURRENT_ADDRESS("Chacabuco 25"),
    PERMANENT_ADDRESS("Tu hermana 420");

    private final String value;

    ElementsData(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
