package codetalksdna.enums;

public class EnumExample {
    public static void main(String[] args) {
        WeeksOfDays today = WeeksOfDays.SUNDAY;
        if ((WeeksOfDays.SATURDAY == today) || (WeeksOfDays.SUNDAY == today)) {
            System.out.println("It is Weekend");
        } else {
            System.out.println("It is an Working Day");
        }
    }
}
