// import java.util.TreeMap;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Polynomial poly1 = readPolynomialFromFile("file1.txt");
        Polynomial poly2 = readPolynomialFromFile("file2.txt");

        Polynomial sum = poly1.add(poly2);

        writePolynomialToFile(sum, "sum.txt");
    }

    private static Polynomial readPolynomialFromFile(String fileName) {
        Polynomial poly = new Polynomial();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                int degree = Integer.parseInt(parts[0]);
                int coefficient = Integer.parseInt(parts[1]);
                poly.addTerm(degree, coefficient);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return poly;
    }

    private static void writePolynomialToFile(Polynomial poly, String fileName) {
        try (FileWriter fw = new FileWriter(fileName)) {
            fw.write(poly.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}