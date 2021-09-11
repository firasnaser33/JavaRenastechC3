package JavaPractice;

public class day08_practice {
    public static void main(String[] args) {

        String myStr= "Hello";
                     //01234
        char ch1= myStr.charAt(1);
        System.out.println(ch1);
        System.out.println(myStr.charAt(3));
        char letter0=myStr.charAt(0);

        String firsName="Firas";
        String lastName="Naser";
        String fullName= (firsName +" "+ lastName);

        System.out.println(firsName.concat(" "+lastName));
        System.out.println(firsName.concat(" ").concat(lastName));
        System.out.println(fullName.concat(" "+letter0));

        int score=99;

        System.out.println(fullName.concat(" ").concat(""+score));

        System.out.println(fullName.concat("\n")+("Score is : ").concat(""+score));

        String lookForNumberMethod= "Naza";
        System.out.println(lookForNumberMethod.contains("N"));

        String endWithMethod= " Java is Fun and Hard it requires lots of practice";
        System.out.println(endWithMethod.endsWith("e"));
        System.out.println(endWithMethod.endsWith("ice"));
        System.out.println(endWithMethod.endsWith("Practice"));
        System.out.println(endWithMethod.endsWith("of practice"));


        String str1= "Nazaley";
        String str2= "nazaley";
        String str3= "NAzaley";

        System.out.println("*********");
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.equalsIgnoreCase(str3));


    }




}
