package codetalksdna.CodingPrograms;

public class EnumByStringCode {

    public enum MyEnum {
        MONDAY("Working Day"), SUNDAY("Weekend");

        private final String days;

        MyEnum(String days) {
            this.days = days;
        }
    }

    public static void main(String[] args) {
        String value = MyEnum.MONDAY.days;
        System.out.println(value);
    }
}
