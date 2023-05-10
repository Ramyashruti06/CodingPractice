package codetalksdna.SuperKeyword;

class C {
    public void m1() {
        System.out.println("I am from C");
    }
}

class A extends C {
    public void m1() {
        System.out.println("I am from A");
    }

    public void show() {
        super.m1();
    }
}

class B extends A {
    public void m1() {
        System.out.println("I am from B");
    }

    public void show() {
        A a = new A();
        a.show();
    }
}


public class SuperKeyword {
    public static void main(String[] args) {
        B b = new B();
        b.show();
    }
}
