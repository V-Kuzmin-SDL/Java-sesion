package STUDY;

public class FindNumininputdata {
    
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };
        int target = 3;
        findnum(target, numbers);
        
}

public static int findnum(int target,int[] numbers) {

        int i;

        for (i = 0; i <= numbers.length; i++) {
            if (numbers[i] ==  target){
                
            System.out.println( "Number found" + i);
            return i;
            }
        }
            System.out.println("Number not found");
            return -1;


        }
        
        

}