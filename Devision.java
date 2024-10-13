class Devision extends Compute{
    public double divide(double numerator, double denominator){
        if(denominator == 0){
            throw new ArithmeticException("Cannot divide by zero");
        }
        return numerator / denominator;
    }
}