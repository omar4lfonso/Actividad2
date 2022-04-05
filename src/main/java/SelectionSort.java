public class SelectionSort {
    public void sel_sort(int arrEnteros[])
    {
        int n = arrEnteros.length;

        // traverse unsorted array
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arrEnteros[j] < arrEnteros[min_idx])
                    min_idx = j;

            // swap minimum element with compared element
            int temp = arrEnteros[min_idx];
            arrEnteros[min_idx] = arrEnteros[i];
            arrEnteros[i] = temp;
        }
    }
}
