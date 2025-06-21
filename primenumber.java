import java.util.ArrayList;
import java.util.Scanner;

public class PrimeArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int limit = sc.nextInt();

       
        ArrayList<Integer> primes = new ArrayList<>();

       
        for (int num = 2; num <= limit; num++) {
            if (isPrime(num)) {
                primes.add(num);
            }
        }

       
        System.out.println("Prime numbers up to " + limit + ": " + primes);
    }

  
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}