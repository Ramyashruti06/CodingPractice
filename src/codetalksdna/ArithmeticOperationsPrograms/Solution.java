package codetalksdna.arithmeticOperations;

public class Solution {
    public static void main(String[] args) {
        Question q = new Question();
        int p = q.solvingquestion();
        System.out.println(p);
    }
}
class Question {
    public static int solvingquestion() {
        int n1 = 18;
        int n2 = 6;
        int n3 = 4;
        int n4 = 8;
        int n5 = 6;
        int n6 = 3;
        int total = n1 - n2 - n3 - n4 - n5 + n6;
        return total;
    }
}

