import java.util.ArrayList;

public class BasicJava {

    public static void main(String[] args) {
        //oneTo255;
        //oddNumbers();
        //printSum();
        //iterateArray();
        //int[] array = {2, 10, 3};
        //findMax(array);
        //getAverage(array);
        arrayWithOddNum();

    }

    public static void oneTo255(){
        for(int i=0; i<=255; i++){
            System.out.println(i);
        }
    }

    public static void oddNumbers(){
        for (int i=0; i<=255; i++){
            if (i%2 != 0){
                System.out.println(i);
            }
        }
    }

    public static void printSum() {
        int sum = 0;
        for(int i=0; i <=255; i++){
            sum = sum + i;
            System.out.printf("New number: %d Sum: %d%n", i, sum);
        }
    }

    public static void iterateArray(){
        int[] myArray = {1,3,5,7,9,13};
        for(int i=0; i<myArray.length; i++){
            System.out.println(myArray[i]);
        }
    }

    public static void findMax(int[] array){
        int max = array[0];
        for(int i=0; i<array.length; i++){
            if(array[i]>max){
                max = array[i];
            }
        }
        System.out.println(max);
    }

    public static void getAverage(int[] array){
        int avg = 0;
        for(int i=0; i<array.length; i++){
            avg += array[i];
        }
        System.out.println(avg/array.length);
    }

    public static void arrayWithOddNum(){
        ArrayList<Integer> y = new ArrayList<Integer>();
        for(int i = 0; i<=255; i++){
            if (i%2 != 0){
                y.add(i);
            }
        }
        for (Integer num : y){
            System.out.println(num);
        }
    }
}