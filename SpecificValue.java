public class SpecificValue {
     public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7};
        int value = 9;
        boolean found = false;
        for (int num : arr) {
            if (num == value) {
                found = true;
                break;
            }
        }
        if (found)
            System.out.println(value + " is in the array.");
        else
            System.out.println(value + " is not in the array.");
    }
}
