package JavaPractice;



import java.util.Scanner;

      public class day07_classPractice {
          public static void main(String [] args){
//              Scanner firas=new Scanner(System.in);
//              System.out.println("Insert number here: " );
//              int faris= firas.nextInt();
//              System.out.println(" You have inserted : " + faris);
//
//              if (faris % 2 == 0){
//                  System.out.println(faris +   " is even number " );
//              }else {
//                  System.out.println(faris + " is odd");
//              }
//
//              //Max and Min number
//
//              Scanner naser= new Scanner(System.in);
//              System.out.println(" Insert First Number: ");  int num1= naser.nextInt();
//              System.out.println( " Insert Second Number: "); short num2= naser.nextShort();
//              System.out.println( " Insert Third Number: "); int num3= naser.nextInt();
//
//              int maxNumber= (num1 > num2 && num1 > num3) ? num1 : (num2 > num1 && num2 > num3) ? num2 :num3;
//              System.out.println(" Max number is " + maxNumber);


              //Min number
              Scanner input=new Scanner(System.in);
              System.out.println(" Insert First number for Minimum number: "); int num4= input.nextInt();
              System.out.println(" Insert Second number for Minimum number: "); int num5= input.nextInt();
              System.out.println(" Insert Third number for Minimum number: "); int num6= input.nextInt();

              int min;

              if (num4 < num5 && num4 < num6  ) {
                  System.out.println( (min=num4) + " is minimum number");
              }else if(num5 < num4 && num5 < num6){
                  System.out.println( (min=num5) + " is minimum number");
              }else {
                  System.out.println( (min=num6) + " is minimum number");
              }



          }



}
//minute 1:50:00  day 7 recording