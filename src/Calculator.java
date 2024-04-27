public class Calculator {

    private final int firstNumber;
    private final int secondNumber;

    public Calculator(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public int sum() {
        return (firstNumber + secondNumber);
    }

    public int subtract(Boolean subtractFromFirst) {
        if (subtractFromFirst) {
            return (firstNumber - secondNumber);
        } else return (secondNumber - firstNumber);
    }

    public int multiply() {
        return (firstNumber * secondNumber);
    }

    public double divide(Boolean divideFirstBySecond) {
        if (divideFirstBySecond) {
            return ((double) firstNumber / secondNumber);
        } else return ((double) secondNumber / firstNumber);
    }
}
