package dady04_ifStatements;

public class c5_ifStatement {
    public static void main(String[] args) {

        boolean bol1=10 >5; //true
        boolean b2= 10 ==12; //false

        if (2>2){// opening bracket for if // false
            // if if condition is false java will not check inside this statement
            System.out.println("hello");
        }// closing bracket for if



        System.out.println("Java");
        if (1==1);{ //true
            //if this statement is true java will inside of if statemet adn excute the code

            System.out.println("World");
            System.out.println("World");
            System.out.println("World");
        }


        if (b2){//false
            System.out.println(b2); // thise wont be printed as b2 is false if it was true it wouldve printed


        }
        if (true){ // if is true java will excute indide if statemetn
            // inside if
            System.out.println("b2 is " +b2); // b2 is false
        }
    }// closing bracket for main



}// closing bracket for class
