import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Riemann {

    private Map<Long, Double> table= new ConcurrentHashMap<Long, Double>();


    public Riemann() {
        table.put(0L, 1.0);
        table.put(1L, 1.0);
        table.put(2L, 1.0 / 4.0 + 1.0);
    }

    public double compute(long n, int s) {
        // 1/n^2 + 1/n^2 + 1/n^2 + ...
        // 1/1^2 + 1/2^2 + 1/3^2 + ...
        // 1     + 1/4   + 1/9   + ...

        Double cached= null;
        if ((cached= table.get(n)) != null) {
            return cached;
        }

        double v= (1/Math.pow(n, s)) + compute(n-1, s);
        table.put(n, v);
        return v;
    }

    public double[][] asSeries() {
        double[][] retValue= new double[table.size()][2];

        Iterator<Long> iterator= table.keySet().iterator();
        // TODO: sort the list
        for (int i= 0; i < table.size(); i++) {
            Long key= iterator.next();
            retValue[i][0]= new Double(key);
            retValue[i][1]= table.get(key);
        }

        return retValue;
    }
}
