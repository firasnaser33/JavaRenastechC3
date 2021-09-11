package JavaPractice;




public class da04endOfClassPractice {

    public static void main(String[] args) {



      // pre and Post Examples
        //pre adds or subtract one immidetily
        //post applies on line afrter

//        long l1=9;
//        System.out.println(++l1); // pre condition immediately add one so will be 10
//        System.out.println(l1--); //post condition add/minus one on next kline so thiss will stay same. 10
//        System.out.println(l1--); //post minus one from previous post = 9
//        System.out.println(++l1); // pre add right away = 9
//        System.out.println(l1--); // post 9
//        System.out.println(l1--); // post 8
//        System.out.println(--l1); //  pre 6
//        System.out.println(--l1); // pre 5
//        System.out.println(l1++); // post 5
//        System.out.println(++l1); // pre 7
//        System.out.println(l1); // 7


        // C3_Logical operators

        // && -- and operator

//        int a=10, b=20, c=20 ,d=40;
//        System.out.println("Variable A = " + a);
//        System.out.println("Variable B = " + b);
//        System.out.println("Variable C = " + c);
//        System.out.println("Variable D = " + d);
//
//        if (a<b && b==c){
//            d=a+b+c;
//            System.out.println("The sum is: " + d);
//        } else System.out.println("False condition ");
//
//        System.out.println( (5>3) && (3>5) );//(true && false) //false
//        System.out.println((10>=10) && (10<=10)); //true && true  // true


        // ( || ) ( or ) operator
        //'Logical OR' Operator(||): This operator returns true when one of the two conditions under
        // consideration are satisfied or are true. If even one of the two yields true, the operator results true.
        // To make the result false, both the constraints need to return false.
//
//        // initializing variables
//        int a = 10, b = 1, c = 10, d = 30;
//
//        // Displaying a, b, c
//        System.out.println("Var1 = " + a);
//        System.out.println("Var2 = " + b);
//        System.out.println("Var3 = " + c);
//        System.out.println("Var4 = " + d);
//
//        // using logical OR to verify
//        // two constraints
//        if (a > b || c == d)
//            System.out.println("One or both"
//                    + " the conditions are true");
//        else
//            System.out.println("Both the"
//                    + " conditions are false");
//
//        System.out.println(9<3 || 3>9);// false
//        System.out.println(3<9|| 3>9);// true



        //  !  -- not (opposite)
        // !true == false
        // !!false ==> !true == > false // you have to take each "!" at a time that's why this example is false


//        System.out.println(("firas"=="Firas") || ("faris" != "Faris"));

        //operators continued
        int x=9;
        System.out.println(x);

        x=3;
        System.out.println(x);

        x= x+10; //  x==13
        x = x+20; //33
        System.out.println(x);

        x+=3;
        System.out.println(x); // x = x +3 ==36
        x-=9; // x = x-9 ==27
        System.out.println(x);

        int y = 20;

        y= y +20;// 40
        y+= 20; //60
        y *= 2; //120
        System.out.println(y);

        x = -y; // reassigned x to y, y already is 120 adding the minus will just make it negative
        System.out.println(x);

        x -=y; //x= x - y ==x ,  -120 -120
        System.out.println(x);


        System.out.println("xxxxxxxxxxxxxxx");

        int z =10;
        int w = 20;

        z =  w - z +10 + --z;  // --z = pre condition a already equals 10 if you apply pre condiiton it will be 9
        System.out.println(z);
        // z = 20 - (10) + 10 + 9+ ==29
        // z = 29

        z -= z + z - z +20;
        // z = Z - (z+z - z +20) ==-20
        System.out.println(z);


         int number= 20;

         number *= 2; //number = number *2 = 40
        System.out.println(number);//40

        number /= 2; //20









    }


}
