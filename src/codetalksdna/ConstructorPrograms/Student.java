package codetalksdna.ConstructorPrograms;

public class Student {
    int rollNo;
    String classSection;

    //Empty or No-Arg Constructor
    public Student() {
    }

    //Parameterized Constructor
    public Student(int rollNo, String classSection) {
        this.rollNo = rollNo;
        this.classSection = classSection;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
