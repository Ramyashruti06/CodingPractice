package codetalksdna.CodingPrograms;
import java.util.Scanner;
public class FloydTriangle {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number of rows: ");
            System.out.println("Enter the number: ");
            int rows = sc.nextInt();
            int number = sc.nextInt();

            for(int i = 1; i <= rows; i++) {

                for(int j = 1; j <= i; j++) {
                    System.out.print(number + " ");
                    ++number;
                }

                System.out.println();
            }
        }
    }

