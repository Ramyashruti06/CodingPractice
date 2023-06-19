package codetalksdna.CodingPrograms;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class OutputStreamToString {
    public static String convertToString(OutputStream outputStream) {
        if (outputStream == null) {
            return null;
        }

        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) outputStream;
        return new String(byteArrayOutputStream.toByteArray(), StandardCharsets.UTF_8);
    }

    public static void main(String[] args) {
        String content = "Hello, world!";
        OutputStream outputStream = new ByteArrayOutputStream();
        try {
            outputStream.write(content.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }

        String convertedString = convertToString(outputStream);
        System.out.println(convertedString);
    }
}
