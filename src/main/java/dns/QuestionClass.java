package dns;

public enum QuestionClass {

    INTERNET(1),
    CSNET(2),
    CHAOS(3),
    HESIOD(4),
    ANY(255);

    private final int value;

    QuestionClass(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
