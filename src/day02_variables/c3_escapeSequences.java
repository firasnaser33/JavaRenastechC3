package day02_variables;

public class c3_escapeSequences {
    //escape sequences:
    //     \t:parargrap space



    public static void main (String [] args){
        System.out.println("Renastech");

        //     \t: parargraph space
        System.out.println("\tReanastech");
        System.out.println("     Reanastech");
        System.out.println("\t\t\t\tReanastech");


        //    \n: new line -- text will be displayed in new line
        System.out.println("HelloWorld");
        System.out.println("Hello \nWorld");
        System.out.println("Hello \n\tWorld \t JAVA");


        //    \-- thiswill print single slash on the console
        System.out.println("\\");
        System.out.println("/");


        //  "" \":prints double quote " on the console
        System.out.println("Today is \"Tuesday\" .");


        //   \': prints single quote
        System.out.println ("Today is \'Tuesday' . ");
        System.out.println("\"Today is 'Tuesday' . \"");





    }


}
