package STUDY;
// программа, которая сортирует массив целых чисел по возрастанию 
// с помощью пузырьковой сортировки
public class bubblesort {

    public static void main(String[] args) {

        int[] arr = { 5, 32, 11, 33, 7, 2, 9, 116, 4 };
        
        bubbleSort(arr);
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]); 
        }
    }
    
    public static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }            }
        }
    }
}
