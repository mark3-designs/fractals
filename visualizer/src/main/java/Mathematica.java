public class Mathematica {

    public static class Fractals {
        public static void main(String[] args) {
            System.out.println("hello world");
        }
    }

    public static class Factorials {
        public static void main(String[] args) {


        }
    }

    public static class InfiniteSeries {
        public static void main(String[] args) {

            Riemann S= new Riemann();

            System.out.println("S(30, 2): "+ S.compute(30, 2));
            System.out.println("S(30000, 2): "+ S.compute(3000, 2));

            double[][] table= S.asSeries();

            for (int i= 0; i < table.length; i++) {
                // System.out.println(i+ ": S("+ table[i][0] +") => "+ table[i][1]);
            }

            System.out.println((1/12.0));

        }
    }
}
