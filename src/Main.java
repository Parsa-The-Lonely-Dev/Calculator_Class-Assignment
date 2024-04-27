public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator(8, 17);
        System.out.println(calculator.sum());
        System.out.println(calculator.subtract(true));
        System.out.println(calculator.subtract(false));
        System.out.println(calculator.multiply());
        System.out.println(calculator.divide(true));
        System.out.println(calculator.divide(false));
    }
}
