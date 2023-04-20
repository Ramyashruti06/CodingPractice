package codetalksdna.StringClass;

public class BasicStringClassExample {
    public static void main(String[] args) {
        StringExample stringExample = new StringExample();
        String s = stringExample.getInUpper();
        System.out.println("My Result Set is::" + "" + s);
    }
}

class StringExample {
    public String getInUpper() {
        String str = "kramyashruti";
        String s = str.toUpperCase();
        return s;
    }
}
