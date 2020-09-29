public class Multiply extends Calc {
    double a;
    double b;

    @Override
    public double calc() {
        return a*b;
    }

    public Multiply(double a, double b) {
        this.a = a;
        this.b = b;
    }
}