package dns;

import java.util.Arrays;

public enum QuestionType {

    A(1),
    NS(2),
    CNAME(5),
    SOA(6),
    WKS(11),
    PTR(12),
    HINFO(13),
    MX(15),
    TXT(16),
    AAAA(28),
    ALL(255);

    private final Integer value;

    QuestionType(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public static String stringValueOf(Integer value) {
        for (QuestionType questionType : QuestionType.values()) {
            if (questionType.value.equals(value)) {
                return questionType.toString();
            }
        }
        return String.format("Unknown<%s>", value);
    }

    public static QuestionType valueOf(Integer value) {
        for (QuestionType questionType : QuestionType.values()) {
            if (questionType.value.equals(value)) {
                return questionType;
            }
        }
        throw new IllegalArgumentException("No matching value for " + value);
    }

    public static boolean isValid(final Integer value) {
        return Arrays.stream(QuestionType.values()).anyMatch(questionType -> questionType.value.equals(value));
    }
}
