package codetalksdna.PrimitiveToClass;

public class NullCase {
    public static void main(String[] args) {
        Test test = null;
        test = new Test();
        test.setName("Bhushan");
        System.out.println(test.getName());
    }
}

class Test {

    private String name;
    private String rollNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }
}
