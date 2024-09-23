package STUDY;

public class FactorialN {

public static void main(String[] args) {
    System.out.println(factorial(-5)); // -1 System.out.println(factorial(5)); // 120 }
    
    System.out.println(factorial(5)); // 120
        }


public static long factorial(int n) {
    if (n < 0) {
        return -1;
    }

    long result = 1;
    for (int i = 1; i <= n; i++) {
        result *= i;
    }

    return result;}

}