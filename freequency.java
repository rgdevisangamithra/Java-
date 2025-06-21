import java.util.Scanner;

public class RepeatingCharFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int[] freq = new int[256]; // ASCII size

        // Count frequency of each character
        for (int i = 0; i < input.length(); i++) {
            freq[input.charAt(i)]++;
        }

        System.out.println("Repeating characters and their frequencies:");
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 1) {
                System.out.println((char)i + ": " + freq[i]);
            }
        }

        sc.close();
    }
}