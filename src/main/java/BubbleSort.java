public class BubbleSort {
    public void bubbleSort(int[] arrEnteros) {
        int n = arrEnteros.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arrEnteros[j - 1] > arrEnteros[j]) {
                    //swap elements
                    temp = arrEnteros[j - 1];
                    arrEnteros[j - 1] = arrEnteros[j];
                    arrEnteros[j] = temp;
                }

            }
        }
    }
}
