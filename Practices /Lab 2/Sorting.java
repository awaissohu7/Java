//Task 7. Try to implement any sorting algorithm in java like bubble and selection sort.

public class Sorting {
    
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int min = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 12, 78, 32, 56, 1, 1000 };

        System.out.println("Array Before Bubble Sort: ");
        for(int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();

        bubbleSort(arr);

        System.out.println("Array after Bubble Sort: ");
        for(int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("Array Before Selection Sort: ");
        for(int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();

        selectionSort(arr);

        System.out.println("Array after Selection Sort: ");
        for(int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();

    }






















}