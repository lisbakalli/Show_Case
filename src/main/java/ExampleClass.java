public class ExampleClass {
    public static double add(double numberOne, double numbreTwo) {
        return numberOne + numbreTwo;
    }

    public static double subtract(double numberOne, double numbreTwo) {
        return numberOne - numbreTwo;
    }

    public static double wrongAdd(double numberOne, double numbreTwo) {
        if (numberOne == 2)
            return 3;
        else
            return numberOne + numbreTwo;
    }
}
