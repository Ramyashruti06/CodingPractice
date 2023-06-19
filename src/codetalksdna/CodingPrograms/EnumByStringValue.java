package codetalksdna.CodingPrograms;

public class EnumByStringValue {
    enum MyEnum {
        ENUM_VALUE_1("Value 1"),
        ENUM_VALUE_2("Value 2"),
        ENUM_VALUE_3("Value 3");

        private final String stringValue;

        MyEnum(String stringValue) {
            this.stringValue = stringValue;
        }

        public String getStringValue() {
            return stringValue;
        }

        public static MyEnum fromStringValue(String value) {
            for (MyEnum enumValue : MyEnum.values()) {
                if (enumValue.stringValue.equals(value)) {
                    return enumValue;
                }
            }
            throw new IllegalArgumentException("Invalid string value: " + value);
        }
    }

    public class EnumByStringValueExample {
        public static void main(String[] args) {
            String value = "Value 2";
            MyEnum enumValue = MyEnum.fromStringValue(value);

            System.out.println("Enum constant for string value '" + value + "': " + enumValue);
        }
    }
}
