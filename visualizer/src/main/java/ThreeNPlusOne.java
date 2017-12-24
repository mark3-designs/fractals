public class ThreeNPlusOne {

    public double compute(long n) {
        if (n % 2 == 0) {
            // even
            return n / 2;
        }
        return (3 * n) + 1;
    }
}
