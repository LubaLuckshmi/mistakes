package sem3.task3;
public class Calculator {
    public static double divide(double num1, double num2) throws BusinessLogicException {
        if (num2 == 0) {
            throw new BusinessLogicException("Division by zero is not allowed.");
        }
        return num1 / num2;
    }
}