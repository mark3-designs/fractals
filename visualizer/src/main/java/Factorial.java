public class Factorial {

    public double compute(long n) {
        int sign= 1;
        if (n < 0) { sign= -1; n= -n; }
        if (n == 0) { return 1; }
        return sign * n * compute(n-1);
    }
}
