import java.util.TreeMap;

public class Polynomial {
    private TreeMap<Integer, Integer> coefficients;

    public Polynomial() {
        coefficients = new TreeMap<>();
    }

    public void addTerm(int degree, int coefficient) {
        coefficients.put(degree, coefficient);
    }

    public Polynomial add(Polynomial other) {
        Polynomial result = new Polynomial();
        for (Integer degree : this.coefficients.keySet()) {
            result.addTerm(degree, this.coefficients.get(degree));
        }
        for (Integer degree : other.coefficients.keySet()) {
            result.addTerm(degree, other.coefficients.get(degree));
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Integer degree : coefficients.keySet()) {
            if (sb.length() > 0) {
                if (coefficients.get(degree) > 0) {
                    sb.append(" + ");
                } else if (coefficients.get(degree) < 0) {
                    sb.append(" - ");
                }
            }
            sb.append(Math.abs(coefficients.get(degree)));
            if (degree > 1) {
                sb.append("x^" + degree);
            } else if (degree == 1) {
                sb.append("x");
            }
        }
        return sb.toString();
    }
}