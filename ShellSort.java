public class ShellSort {
    void printArray(int arr[]) {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    void shellSort(int array[]) {
        int n = array.length;
        for (int interval = n / 2; interval > 0; interval /= 2) {
            for (int i = interval; i < n; i += 1) {
            int temp = array[i];
            int j;
            for (j = i; j >= interval && array[j - interval] > temp; j -= interval) {
                array[j] = array[j - interval];
            }
            array[j] = temp;
            }
        }
    }
    public static void main(String[] args) {
        ShellSort shs = new ShellSort();
        int[] array = {9, 8, 3, 7, 5, 6, 4, 1};
        System.out.println("Elements before sorting:");
        shs.printArray(array);
        
        shs.shellSort(array);
        System.out.println("Elements after sorting:");
        shs.printArray(array);
 
    }
}