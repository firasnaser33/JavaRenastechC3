package day03_variablesContinue;

public class c2_String {

    // string is no primitive data type

    public static void main(String [] args){

         String nameOfStudent="Ozer";
         String schoolName="Renastech";

         int studentID=23456;//number
        String id="12423";// this will be a text
        System.out.println(nameOfStudent);
        System.out.println("Name is : " + nameOfStudent + " ,Student ID : " +studentID);

        //if you want to print differnet lines
        System.out.println("name is : " + nameOfStudent + "\n School Name : " + schoolName);


        String number1="1000";
        int number2=1000;

        System.out.println(number1+10); //text + number  (since we have string inside it concade)
        System.out.println(number2+10); //number + number (since both is number it will sum)


        String name1="Firas";
        String age1="23";

        String name2="Bahast";
        String age2="24";

        String name3="Mund";
        String age3="24";



        System.out.println(name1);
        System.out.println("Firas is" + age1 + " old");

        System.out.println(name2);
        System.out.println("Bahast is" +age2 + " old");

        System.out.println(name3);
        System.out.println("Mund is" +age1 + " old");






    }
}
