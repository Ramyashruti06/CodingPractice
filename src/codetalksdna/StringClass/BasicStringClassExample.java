package codetalksdna.StringClass;

public class BasicStringClassExample {
    public static void main(String[] args) {
        StringExample stringExample = new StringExample();
        String str = stringExample.getInUpper();
        System.out.println("My Result Set is::" + "" + str);
    }
}

class StringExample {
    public String getInUpper() {
        String str = "kramyashruti";
        String s = str.toUpperCase();
        return s;
    }
}
