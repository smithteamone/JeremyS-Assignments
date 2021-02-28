public class FizzBuzz {
    public String fizzBuzz(int number) {
        //fizzbuzz logic here
        if(number % 3 == 0 && number % 5 == 0 ){
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fuzz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else {
            return Integer.toString(number);
        }
    }

    public void fizzBuzzCounter(){
        for (int i = 0; i <= 100; i++){
            String result = fizzBuzz(i);
            System.out.println("Number " + i + " - " + " Result: " + result);
        }
    }
}