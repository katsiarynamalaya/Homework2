public class Plus extends Calc {
    double a;
    double b;

    @Override
    public double calc() {
        return a+b;
    }

    public Plus(double a, double b) {
        this.a = a;
        this.b = b;
    }
}
