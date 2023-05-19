package codetalksdna.StringClassMethodsPrograms;

public class Immutability {
    public static void main(String[] args) {
        String nitesh = "Hyderabad";
        String shruti = "Hyderabad";

//It will try to change in same Object.
        shruti.concat("Bangalore");

        //It will create new Object
        shruti = shruti.concat("bangalore");

        System.out.println(shruti);
        System.out.println(nitesh);
    }
}
