package day03_variablesContinue;

import java.sql.SQLOutput;

public class c3_StringPrractice {

    public static void main(String [] args){
        String name1="basoz";
        String name2="bahast";

        int age1=22;
        int age2=24;

        System.out.println("Basoz age is");


        System.out.println(name1 + " age is : " + age1);
        System.out.println(name2 + "age is :" + age2 );

        System.out.println("person 1 name is : " + name1);

        System.out.println("Sum of persons age is : " + age1+age2 ); //text + number + number =text
        System.out.println("Sum of persons age is : " +(age1+age2) );// text + (number + number )

        int sumOFAges= age1=age2;
        System.out.printf("Sum of All" + sumOFAges);


    }
}

