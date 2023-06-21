package codetalksdna.CodingPrograms;

public enum MyEnum {
    MONDAY("Working Day"), SUNDAY("Weekend");
    private final String days;

    MyEnum(String days) {
        this.days = days;
    }
}
