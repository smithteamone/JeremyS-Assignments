import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class PuzzlingJava{
    public static void main(String[] args){
        int[] numbers = {3,5,1,2,7,9,8,13,25,32};
        //System.out.println(numbers(numbers));
        System.out.println(randomNumber());

    }

    public static ArrayList<Integer> numbers(int[] number){
        ArrayList<Integer> arryList = new ArrayList<Integer>();
        for (int i=0; i<number.length; i++){
            if (number[i]>10){
                arryList.add(number[i]);
            }
        }
        return arryList;
    }

    public static int[] randomNumber() {
        int[] arr = new int[10];
        Random r = new Random();
        for (int i = 0; i< arr.length; i++){
            arr[i] = r.nextInt(100-55) + 55;
        }
        Arrays.sort(arr);
        return arr;
    }
}