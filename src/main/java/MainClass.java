public class MainClass {


    /**
     * **************BUBBLE_SORT***********
     * @param arrEnteros
     */
    static void bubbleSort(int[] arrEnteros) {
        int in;
        int out;

        int n = arrEnteros.length;
        int temp = 0;

        for (out = n - 1; out > 1; out--) {
            for (in = 0; in < out; in++) {
                if (arrEnteros[in] > arrEnteros[in + 1]) {
                    //swap elements
                    temp = arrEnteros[in];
                    arrEnteros[in] = arrEnteros[in + 1];
                    arrEnteros[in + 1] = temp;
                }
            }
        }
    }

    /**
     * ***************INSERTION_SORT******************
     * @param arrEnteros
     */
    static void insertionSort(int[] arrEnteros) {
        int in;
        int out;
        int n = arrEnteros.length;
        for (out = 1; out < n; out++) {
            int key = arrEnteros[out];
            in = out;
            while ((in > 0) && (arrEnteros[in - 1] >= key)) {
                arrEnteros[in] = arrEnteros[in-1];
                --in;
            }
            arrEnteros[in] = key;
        }
    }

    /**
     * **************SELECTION_SORT****************
     * @param arrEnteros
     */
    static void selectSort(int arrEnteros[]) {
        int endIndex = arrEnteros.length - 1;
        for (int current = 0; current < endIndex; current++) {
            swap(current, minIndex(current, endIndex, arrEnteros));
        }
    }

    static void swap(int val1, int val2){
        //swap elements
        int temp = val1;
        val1 = val2;
        val2 = temp;
    }

    static int minIndex(int start, int end, int values[]) {
        int indexOfMin = start;
        for (int index = start + 1; index <= end; index++){
            if (values[index] < values[indexOfMin]){
                indexOfMin = index;
            }
        }
        return indexOfMin;
    }

    public static void main(String[] args) {
        int[] arrNumber = {13, 17, 12, 8, 13, 3, 7, 11, 2, 10};
        int[] arrOrdered = arrNumber.clone();

        long start = System.currentTimeMillis();
        bubbleSort(arrOrdered);
        long finish = System.currentTimeMillis();
        long timeElapsed = finish - start;
        System.out.println("Bubble Sort elapsed time: " + timeElapsed);

        arrOrdered = arrNumber.clone();
        start = System.currentTimeMillis();
        insertionSort(arrNumber);
        finish = System.currentTimeMillis();
        timeElapsed = finish - start;
        System.out.println("Bubble Sort elapsed time: " + timeElapsed);

        arrOrdered = arrNumber.clone();
        start = System.currentTimeMillis();
        selectSort(arrNumber);
        finish = System.currentTimeMillis();
        timeElapsed = finish - start;
        System.out.println("Bubble Sort elapsed time: " + timeElapsed);
    }
}
