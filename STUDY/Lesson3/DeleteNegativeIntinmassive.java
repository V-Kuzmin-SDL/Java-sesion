package STUDY.Lesson3;


import java.util.ArrayList;


public class DeleteNegativeIntinmassive {
    
    
                               // Удаление отрицательных значений из массива
    public static int[] removeNegatives(int[] array) {
        ArrayList<Integer> positiveList = new ArrayList<>();
        
        
        for (int num : array) {
            if (num >= 0) {
                positiveList.add(num);
            }
        }
        
        // список обратно в массив
        int[] result = new int[positiveList.size()];
        for (int i = 0; i < positiveList.size(); i++) {
            result[i] = positiveList.get(i);
        }
        
        return result;
    }

    public static void main(String[] args) {
       
        int[] array = {-3, 1, -2, 4, 0, -5, 6};
        int[] result = removeNegatives(array);

        
        System.out.print("Массив без отрицательных значений: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}


