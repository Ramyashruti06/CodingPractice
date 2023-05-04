package codetalksdna.arithmeticOperations;

public class Statement {
    public static void main(String[] args) {
            Problem problem = new Problem();
            int p = problem.solvingstatement();
            System.out.println(p);
        }
    }

    class Problem {
        public static int solvingstatement() {
            int num1 = 8;
            int total = num1 / num1 * num1 + num1 / num1 / num1 * num1 + num1;
            return total;
        }
    }


