package codetalksdna.InheritancePrograms;

//Parent Class.
class Car {
    public void carHorn() {
        System.out.println("Car has a special Horn.");
    }
}

//Child Class.
class MarutiSuzuki extends Car {
    public void marutiSuzukiHorn() {
        System.out.println("MarutiSuzuki has its own Horn.");
    }
}

//GrandChild Class.
class Hyundai extends MarutiSuzuki {
    public void hyundaiHorn() {
        System.out.println("Hyundai has its own Horn.");
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Hyundai hyundai = new Hyundai();
        hyundai.hyundaiHorn();
        hyundai.marutiSuzukiHorn();
        hyundai.carHorn();
    }
}
