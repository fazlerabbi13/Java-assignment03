import java.util.Arrays;

public class ReverseArray {
     public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7};
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println("Reversed array: " + Arrays.toString(arr));
    }
}
