public class Division extends Calc {
    double a;
    double b;

    @Override
    public double calc() {
        return a/b;
    }

    public Division(double a, double b) {
        this.a = a;
        this.b = b;
    }
}