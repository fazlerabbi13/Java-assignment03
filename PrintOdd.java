public class PrintOdd {
     public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7};
        System.out.print("Odd numbers: ");
        for (int num : arr) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
    }
}
