package codetalksdna.SuperKeyword;

class AA {
    AA() {
        super();
        System.out.println("I am from constructor AA");
    }
}

class BA extends AA {
    BA() {
        super();
        System.out.println("I am from constructor BA");
    }
}

public class SuperConstructor {
    public static void main(String[] args) {
        BA ba = new BA();
    }
}
