package JavaPractice;

public class divisiblePracrice {

    //create 3 different number
    // second number should be = first number + 7
    // third number should be  = second number + 8
    //ex : x=25  , y= 32 , z= 40 .
    //ex : x 20 , y= 27 , z= 35 .


    //if the x is divisble by 2 ,3 ,5
//        3. check if x is divisible by 2 , 3 , 5  (Check for each number)
//                      if it is divisible print : x  is divisible by 2 true
//                      if it is not divisible print : x is divisible by 2 false

    public static void main(String [] args) {

        int x = 10;
        int y = x + 7;
        int z = y + 8;

        boolean bl1= x % 2 == 0;
        boolean bl2= x % 3 == 0;
        boolean bl3= x % 5 ==0;

        System.out.println( x + " X is divisble by 2 : " +bl1 );
        System.out.println(" X is divisble by 2 : " +bl2 );
        System.out.println(" X is divisble by 2 : " +bl3 );



    }
}
