import java.util.ArrayList;
public class ReverseArray1{
    public void reverse(int[] numbers, int start, int end){
        while(start<end){
            int temp = numbers[start];
            numbers [start] = numbers[end];
            numbers [end] = temp;
            start++;
            end--;
        }
    }
    public static void printArray(int[] arr){
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr [i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args, int start) {
        int [] numbers = {5,6,7,3,4,2};
        printArray(numbers);
        reverse(numbers,start 0, numbers.length-1);
        printArray(numbers);

    }
}