package day02_variables;

public class c4_variables {

    public static void main(String  []  args){
        //   for numbers: byte, short , int , long , float , double
        // whole number: byte, short, int ,long
        // range:
        //


        byte number1=25;
        System.out.println(number1);

        //byte number2=128; this will give you error because its out of range
        //byte b1=2.5; this will also give you error becasue its decimal not number

        byte number2=-100;
                System.out.println(number2);


         //     short     2bytes     stores whole numbers form -32,768 tp 32767
        short s1=128;
        short s2=20000;

       // short s3=40000;   //out of range

        short s4=20;  // it covers also byte range
        System.out.println("*******");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s4);


        // int     4byte   Stores whole number from -2,147,483,648 to 2,147,483,648

        int i1=3123123;
        System.out.println(i1);

        System.out.println("35"); // this is text
        System.out.println(35);  // this is actual number
        ////  As a defaut java picks int for whole numbers


       // int i2=3434343431     // out of range
       // System.out.println(i2);


        // long    8 byte Stores whole numbers from more the n a billion positive and negative

        long l1=200;
        long l2=123121312; // when you move out of integer range compilar needs to know what is this number
        //that is why we pass L at the end to tell java this is long number

         System.out.println(l1);
        System.out.println(l2);




    }





}
