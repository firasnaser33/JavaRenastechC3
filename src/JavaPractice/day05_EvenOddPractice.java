package JavaPractice;

public class day05_EvenOddPractice {
    //create a java project that will check if number is even or odd

    public static void main(String[] args) {


        int number ;

        number=25;
        String result = "";

        if (number % 2 == 0){
            result = number + " is Even";
        }else {
            result = number + " is odd";
        }
        System.out.println(result);




    }

}


