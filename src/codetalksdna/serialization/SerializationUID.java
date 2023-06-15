package codetalksdna.serialization;

import java.io.*;

class SerializationUIDExample implements Serializable {
    String userName = "Nitesh";
    String password = "Bhushan";
}

public class SerializationUID {
    private static final long serialVersionUID = 4L;
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SerializationUIDExample serializationTransientKeyword = new SerializationUIDExample();
        FileOutputStream fileOutputStream = new FileOutputStream("abc.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(serializationTransientKeyword);

        FileInputStream fileInputStream = new FileInputStream("abc.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        codetalksdna.serialization.SerializationTransientKeyword serializationTransientKeyword1 = (codetalksdna.serialization.SerializationTransientKeyword) objectInputStream.readObject();
        System.out.println(serializationTransientKeyword1.userName + " " + serializationTransientKeyword1.password);
    }
}
