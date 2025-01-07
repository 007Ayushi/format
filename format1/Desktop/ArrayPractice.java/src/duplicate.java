public class duplicate{
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 1, 2, 3, 4, 5};
        int[] brr = new int[arr.length];
        int n = arr.length;
        int index = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < index; j++) {
                if (arr[i] == brr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                brr[index++] = arr[i];
            }
        }

        for (int i = 0; i < index; i++) {
            System.out.print(brr[i] + " ");
        }
        System.out.println();
    }
}
