public class SecondLargest {
    public static void main(String[] args) {
        int[] numbers = {10, 45, 67, 23, 89, 67, 89};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest number (all elements might be equal).");
        } else {
            System.out.println("Second largest number is: " + secondLargest);
        }
    }
}