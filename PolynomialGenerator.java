// Задана натуральная степень k. 

//Сформировать случайным образом список коэффициентов (значения от 0 до 100) 
//многочлена многочлен степени k.
//*Пример: k=2 => 2*x2 + 4*x + 5 = 0 или x2 + 5 = 0 или 10*x2 = 0






import java.util.ArrayList;
import java.util.Random;

public class PolynomialGenerator {
    public static void main(String[] args) {
        int k = 2; // Заданная натуральная степень
        Random random = new Random();
        ArrayList<Integer> coefficients = new ArrayList<>();

        // список коэффициентов для многочлена степени k
        for (int i = 0; i <= k; i++) {
            coefficients.add(random.nextInt(101)); // Генерируем случайное число от 0 до 100
        }

        // Выводим многочлен в виде строки
        String polynomial = generatePolynomial(coefficients, k);
        System.out.println(polynomial);
    }

   
   // private - доступен только внутри текущего класса.
    private static String generatePolynomial(ArrayList<Integer> coefficients, int k) {
        StringBuilder sb = new StringBuilder();

        for (int i = k; i >= 0; i--) {
            int coefficient = coefficients.get(i);

            if (coefficient != 0) {
                if (i == 0) {
                    sb.append(coefficient);
                } else if (i == 1) {
                    sb.append(coefficient).append("x");
                } else {
                    sb.append(coefficient).append("x^").append(i);
                }

                if (i != 0 && coefficients.get(i - 1) >= 0) {
                    sb.append(" + ");
                }
            }
        }

        sb.append(" = 0");
        return sb.toString();
    }
}