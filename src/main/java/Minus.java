public class Minus extends Calc {
    double a;
    double b;

    @Override
    public double calc() {
        return a-b;
    }

    public Minus(double a, double b) {
        this.a = a;
        this.b = b;
    }
}