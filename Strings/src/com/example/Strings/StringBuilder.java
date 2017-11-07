package com.example.Strings;

public class StringBuilder {
    public static void main(String[] args){
        String info = "";

        info += "My name is Bob.";
        info += " ";
        info += " I am a builder.";

        System.out.println(info);

        java.lang.StringBuilder sb = new java.lang.StringBuilder();

        sb.append ("My name is Sue.")
        .append (" ")
        .append ("I am a lion tamer ");

        System.out.println(sb.toString());

        ////Formating/////
        System.out.print("Here is some text.\tThat was a tab. \nThat was a newline. ");
        System.out.println("More text.");
        System.out.printf("Total cost %d; quantity is %d", 5, 120);

        for(int i=0; i < 20; i++){
            System.out.printf("%-2d: %s \n", i, "here is some text");
        }

        //Formatting floating point value
        System.out.printf("Total value: %.2f\n", 5.6789);

        long startTime = System.currentTimeMillis();
        StringBuffer sbu = new StringBuffer(" Java");
        for (int i=0; i < 10000000; i++){
            sbu.append("hello");
        }
        System.out.println("Concatenation time StringBuffer: " +  (System.currentTimeMillis() - startTime));

         startTime = System.currentTimeMillis();
        java.lang.StringBuilder sbuilder = new java.lang.StringBuilder(" Java");
        for (int i=0; i < 10000000; i++){
            sbuilder.append("hello");
        }
        System.out.println("Concatenation time StringBuilder: " +  (System.currentTimeMillis() - startTime));

    }

}
