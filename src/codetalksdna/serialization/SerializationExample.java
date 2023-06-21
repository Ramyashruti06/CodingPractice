package codetalksdna.serialization;

import java.io.*;

class NumbersData implements Serializable {
    int i = 10;
    int j = 20;
}

public class SerializationExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        NumbersData numbersData = new NumbersData();
        FileOutputStream fileOutputStream = new FileOutputStream("abc.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(numbersData);

        FileInputStream fileInputStream = new FileInputStream("abc.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        NumbersData numbersData1 = (NumbersData) objectInputStream.readObject();
        System.out.println(numbersData1.i + " " + numbersData1.j);
    }
}
