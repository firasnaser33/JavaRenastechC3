package JavaPractice;

public class day06_switchStatments {
    //create a java program that will take numbers between 1-12
    //and print months name depends on number
    //ex
    //1 -- jan
    //5 -- may




    public static void main(String[] args) {
    int age=4;
    String Studentgrade;

    switch (age) {
        case (1-5) : Studentgrade="First Grade"; break;
        case 6 : Studentgrade="Sixth Grade"; break;
        case 7 : Studentgrade="Seven Grade"; break;
        case 8 : Studentgrade="Eight Grade"; break;
        case 9 : Studentgrade="Ninth Grade"; break;
        case 10 : Studentgrade="Tenth Grade"; break;
        case 11 : Studentgrade="Eleventh Grade"; break;
        case 12 : Studentgrade="Twelves Grade"; break;
        default:  Studentgrade= " Invalid grade entered Please check number";






        }
        System.out.println(Studentgrade);



    }
}


