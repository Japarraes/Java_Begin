package Exercises789;

public class ZeroDivision {

    public static void main(String[] args) {

        dividePorCero(5,0);
    }

    public static int dividePorCero(int dividendo, int divisor) throws ArithmeticException {

        int division = 0;

        try {
            division = dividendo/divisor;
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse" + "Error: " + e.getMessage());
        } finally {
            System.out.println("Demo de codigo");
        }

        return division;

    }
}
