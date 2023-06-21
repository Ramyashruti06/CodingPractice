package codetalksdna.serialization;

import java.io.*;

class SerializationTransientKeyword implements Serializable {
    String userName = "Nitesh";
    transient String password = "Bhushan";
}

public class SerializationDataExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SerializationTransientKeyword serializationTransientKeyword = new SerializationTransientKeyword();
        FileOutputStream fileOutputStream = new FileOutputStream("abc.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(serializationTransientKeyword);

        FileInputStream fileInputStream = new FileInputStream("abc.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        SerializationTransientKeyword serializationTransientKeyword1 = (SerializationTransientKeyword) objectInputStream.readObject();
        System.out.println(serializationTransientKeyword1.userName + " " + serializationTransientKeyword1.password);
    }
}
