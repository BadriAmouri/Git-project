public class Main {
    public static void main(String[] args) {
        // Check if the correct number of arguments is passed
        if (args.length != 3) {
            System.out.println("Usage: java mySoftware <operator> <number1> <number2>");
            System.exit(1); // Exit the program with an error code
        }

        
        String operator = args[0];
        double num1;
        double num2;

        try {
            num1 = Double.parseDouble(args[1]);
            num2 = Double.parseDouble(args[2]);
        } catch (NumberFormatException e) {
            System.out.println("Error: Both arguments must be numbers.");
            System.exit(1); 
            return;
        }

        // Create the appropriate Calculator subclass based on the operator
        Calculator calculator = null;
        
        switch (operator) {
            case "+":
                calculator = new Addition();
                break;
            case "-":
                calculator = new Subtraction();
                break;
            case "*":
                calculator = new Multiplication();
                break;
            case "/":
                calculator = new Division();
                break;
            default:
                System.out.println("Error: Unsupported operator. Use +, -, *, or /.");
                System.exit(1); // Exit the program with an error code
        }

        // Perform the calculation if the calculator is set
        if (calculator != null) {
            double result = calculator.compute(num1, num2);
            System.out.println("Result: " + result);
        }
    }
}
