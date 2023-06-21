package codetalksdna.serialization;

import java.io.*;

class SerializationUIDExample implements Serializable {
    String userName = "Nitesh";
    String password = "Bhushan";
}

public class SerializationUID {
    private static final long serialVersionUID = 4L;

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SerializationUIDExample serializationUIDExample = new SerializationUIDExample();
        FileOutputStream fileOutputStream = new FileOutputStream("abc.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(serializationUIDExample);

        FileInputStream fileInputStream = new FileInputStream("abc.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        SerializationUIDExample serializationUIDExample1 = (SerializationUIDExample) objectInputStream.readObject();
        System.out.println(serializationUIDExample1.userName + " " + serializationUIDExample1.password);
    }
}
