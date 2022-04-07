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

        // TEST CODE START
        String sEnteros = "";
        int numIteracion = 0;
        // TEST CODE END
        for (out = n - 1; out > 1; out--) {
            for (in = 0; in < out; in++) {
                if (arrEnteros[in] > arrEnteros[in + 1]) {
                    //swap elements
                    temp = arrEnteros[in];
                    arrEnteros[in] = arrEnteros[in + 1];
                    arrEnteros[in + 1] = temp;
                }
                // TEST CODE START
                numIteracion++;
                sEnteros = "";
                for(int i = 0; i <= n-1;i++){
                    sEnteros += Integer.toString(arrEnteros[i]) + " ";
                }
                System.out.println("Iteración #" + numIteracion + ": [" + sEnteros + "]");
                // TEST CODE END
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

        // TEST CODE START
        String sEnteros = "";
        int numIteracion = 0;
        int checkWhileIn = 0;
        // TEST CODE END

        for (out = 1; out < n; out++) {
            int key = arrEnteros[out];
            in = out - 1;
            while ((in > -1) && (arrEnteros[in] > key)) {
                arrEnteros[in + 1] = arrEnteros[in];
                in--;

                // TEST CODE START
                numIteracion++;
                checkWhileIn = 1;
                sEnteros = "";
                for(int i = 0; i <= n-1;i++){
                    sEnteros += Integer.toString(arrEnteros[i]) + " ";
                }
                System.out.println("Iteración #" + numIteracion + ": [" + sEnteros + "]");
                // TEST CODE END
            }
            arrEnteros[in + 1] = key;
            // TEST CODE START
            if(checkWhileIn == 0){
                numIteracion++;
                checkWhileIn = 1;
                sEnteros = "";
                for(int i = 0; i <= n-1;i++){
                    sEnteros += Integer.toString(arrEnteros[i]) + " ";
                }
                System.out.println("Iteración #" + numIteracion + ": [" + sEnteros + "]");
            }
            else{
                checkWhileIn = 0;
            }
            // TEST CODE END
        }
    }

    /**
     * **************SELECTION_SORT****************
     * @param arrEnteros
     */
    static void selectSort(int arrEnteros[]) {
        int endIndex = arrEnteros.length - 1;

        // TEST CODE START
        String sEnteros = "";
        int numIteracion = 0;
        // TEST CODE END

        for (int current = 0; current < endIndex; current++) {
            swap(current, minIndex(current, endIndex, arrEnteros), arrEnteros);

            // TEST CODE START
            numIteracion++;
            sEnteros = "";
            for(int i = 0; i <= endIndex;i++){
                sEnteros += Integer.toString(arrEnteros[i]) + " ";
            }
            System.out.println("Swap #" + numIteracion + ": [" + sEnteros + "]");
            // TEST CODE END
        }
    }

    static void swap(int val1, int val2, int arr[]){
        //swap elements
        int temp = arr[val1];
        arr[val1] = arr[val2];
        arr[val2] = temp;
    }

    static int minIndex(int start, int end, int values[]) {
        int indexOfMin = start;

        for (int index = start + 1; index <= end; index++){

            // TEST CODE START
            String value = (values[index] < values[indexOfMin])?"TRUE":"FALSE";
            System.out.print("Comparación busca de índice " + Integer.toString(values[index]) + "<" + Integer.toString(values[indexOfMin])+ " = " + value);
            // TEST CODE END

            if (values[index] < values[indexOfMin]){
                indexOfMin = index;
            }

            // TEST CODE START
            System.out.println(": index to compare (index)= " + Integer.toString(index) +" - indexOfMin ="+ Integer.toString(indexOfMin));
        }
        return indexOfMin;
    }

    public static void main(String[] args) {
        int[] arrNumber = {13, 17, 12, 8, 13, 3, 7, 11, 2, 10};
        int[] arrOrdered = arrNumber.clone();

        System.out.println("/*********Bubble_Sort:START********/");
        long start = System.currentTimeMillis();
        bubbleSort(arrOrdered);
        long finish = System.currentTimeMillis();
        long timeElapsed = finish - start;
        System.out.println("Bubble Sort elapsed time: " + timeElapsed);

        // TEST CODE START
        int n = arrOrdered.length;
        String sEnteros = "";
        for(int i = 0; i <= n-1;i++){
            sEnteros += Integer.toString(arrOrdered[i]) + " ";
        }
        System.out.println("Final output: [" + sEnteros + "]");
        // TEST CODE END

        System.out.println("/*********Bubble_Sort:End********/");


        System.out.println("/*********Insertion_Sort:START********/");
        arrOrdered = arrNumber.clone();
        start = System.currentTimeMillis();
        insertionSort(arrOrdered);
        finish = System.currentTimeMillis();
        timeElapsed = finish - start;
        System.out.println("Insertion Sort elapsed time: " + timeElapsed);

        // TEST CODE START
        n = arrOrdered.length;
        sEnteros = "";
        for(int i = 0; i <= n-1;i++){
            sEnteros += Integer.toString(arrOrdered[i]) + " ";
        }
        System.out.println("Final output: [" + sEnteros + "]");
        // TEST CODE END

        System.out.println("/*********Insertion_Sort:END********/");

        System.out.println("/*********Selection_Sort:START********/");
        arrOrdered = arrNumber.clone();
        start = System.currentTimeMillis();
        selectSort(arrOrdered);
        finish = System.currentTimeMillis();
        timeElapsed = finish - start;
        System.out.println("Selection Sort elapsed time: " + timeElapsed);

        // TEST CODE START
        n = arrOrdered.length;
        sEnteros = "";
        for(int i = 0; i <= n-1;i++){
            sEnteros += Integer.toString(arrOrdered[i]) + " ";
        }
        System.out.println("Final output: [" + sEnteros + "]");
        // TEST CODE END
        System.out.println("/*********Selection_Sort:END********/");
    }
}
