package a_Easy_Problems;

public class inBuiltMethods {
    public static void main(String[] args) {
        //initialisation
        String str = "Java Language";
        //2nd method
        String str1 = new String("arvind");
        //return length of string
        System.out.println(str.length());
        //return a new string with all lower case
        System.out.println(str.toLowerCase());
        //return a new string with all upper case
        System.out.println(str.toUpperCase());
        //return a new string after all the leading and tailing spaces
        System.out.println(str.trim());
        //return a new substring
        System.out.println(str.subSequence(0,str.length()));
        System.out.println(str.substring(7));
        System.out.println(str.substring(0,7));
        //return a new string after replacing j with k
        System.out.println(str.replace("J","K"));
        // say true or false
        System.out.println(str.startsWith("Ja"));
        // say true or false
        System.out.println(str.endsWith("  "));
        // return char at given index
        System.out.println(str.charAt(4));
        // return index of J
        System.out.println(str.indexOf("J"));
        System.out.println(str.indexOf("J",1,9));
        //return last occurence index of L
        System.out.println(str.lastIndexOf("L"));
        System.out.println(str.lastIndexOf("J",2));
        // return true if str equals to str1 //case-sensitive
        System.out.println(str.equals(str1));
        //return true if str equals to str1 ignoring case of char
        System.out.println(str.equalsIgnoreCase("java language"));



    }
}
