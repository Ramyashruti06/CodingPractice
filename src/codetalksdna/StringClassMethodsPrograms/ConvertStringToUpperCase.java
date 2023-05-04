package codetalksdna.StringClassMethodsPrograms;

public class ConvertStringToUpperCase {
    public static void main(String[] args) {
        LogicForConvertStringToUpperCase convertStringToUpperCase = new LogicForConvertStringToUpperCase();
        String str = convertStringToUpperCase.getInUpper();
        System.out.println("My Result Set is::" + "" + str);
    }
}

class LogicForConvertStringToUpperCase {
    public String getInUpper() {
        String str = "kramyashruti";
        String s = str.toUpperCase();
        return s;
    }
}
