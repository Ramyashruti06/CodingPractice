package codetalksdna.CodingPrograms;

import java.io.InputStream;
import java.util.Scanner;

public class InputStreamToString {
    public static String convertToString(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        Scanner scanner = new Scanner(inputStream).useDelimiter("\\A");
        if (scanner.hasNext()) {
            return scanner.next();
        }
        return "";
    }

    public static void main(String[] args) {
        String content = "Hello, world!";
        InputStream inputStream = new java.io.ByteArrayInputStream(content.getBytes());
        String convertedString = convertToString(inputStream);
        System.out.println(convertedString);
    }
}
