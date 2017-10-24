import java.lang.Math;

public class Hyperbolic {

    public static double sinh(double x) {
        double y;
        y = (Math.exp(x) - Math.exp(-x)) / 2;
        return y;
    }

    public static double cosh(double x) {
        double y;
        y = (Math.exp(x) + Math.exp(-x)) / 2;
        return y;
    }

    public static double tanh(double x) {
        double y;
        y = (((Math.exp(x) - Math.exp(-x)) / 2) / ((Math.exp(x) + Math.exp(-x)) / 2));
        return y;
    }

    public static double coth(double x) {
        double y;
        y = 1 / (((Math.exp(x) - Math.exp(-x)) / 2) / ((Math.exp(x) + Math.exp(-x)) / 2));
        return y;
    }

    public static double sech(double x) {
        double y;
        y = (((1 / ((Math.exp(x) + Math.exp(-x)) / 2))));
        return y;
    }

    public static double csch(double x) {
        double y;
        y = (1 / (Math.exp(x) - Math.exp(-x)) / 2);
        return y;
    }


}
