package dady04_ifStatements;

public class c1_postPreConditions {
    public static void main(String[] args) {

        byte x=21;

        System.out.println(x);
        System.out.println(--x);  // pre decrease number by one

        //post
        int w= 30;
        System.out.println(w--);//post //30 but it will be 29 on next line
        System.out.println(w--);//post  //29 now because of previous condition also it will be 28 on next line
        System.out.println(--w);//pre //28 first but because of pre condioton will be 27  next line will still be 27
        System.out.println(w);
        System.out.println(w++);//post //27
        System.out.println(w); //28


    }
}
