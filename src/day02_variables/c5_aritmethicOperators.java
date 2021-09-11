package day02_variables;

public class c5_aritmethicOperators {
     public static void main (String []  args){

          // float      4 byte
          // double     8 byte

          double dobuled1=5.5;
        System.out.println(dobuled1);
        double d2=5.5555555555;
        System.out.println(d2);

        //  As a default java picks double for decimal number
          System.out.println(2.5);

          float f1=2.5f;  // java will take decimal numbers as a double thats why you need to tell compliler this is an float number
          System.out.println(f1);

          System.out.println("*******");
          System.out.println(2+5);  // it will sum the numbers
          System.out.println("2+5");  //it will keep text as is

          int i1=3;
          int i2=5;

          // sum of 2 numbers
          System.out.println(i1 + i2);

          double number1=2.5;
          double number2=3.5;
          System.out.println(number1 + number2);// 6.0

          // minus operator
          System.out.println(i1 - i2);
          System.out.println(number1 - number2);
          System.out.println(number1 - i1);

          // multiple operator
          System.out.println(i1 * i2);
          System.out.println(number1 * number2);

          // division operators
          System.out.println(i2 / i1); // 5/3

          System.out.println(5/3); // 2 numbers are integers here result will be also integer
          System.out.println(5/3.0); // sincee we usewone number as a double resut will be double 1.6666...



          System.out.println(10/2);  //5
          System.out.println(10.0/2); //5.0


          // reminder
          System.out.println(10 % 5); // using this "%" will give you remainder of division
          System.out.println(10/2);// this will give you the answer to the divison

          System.out.println(10/3); // 3 answer
          System.out.println(10%3);  //1 reminder

          System.out.println(10.0 % 3);


     }



}
