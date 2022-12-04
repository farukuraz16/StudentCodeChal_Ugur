import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String str = "Javacan & JAVATAR";
        m1lastIndex(str);
        m2FirstIndex(str);
        m3while(str);
        m4StrBuilder(str);
        m5StrBuffer(str);
        m6StrArray(str);
        m7ChrArray(str);
        m8bytArray(str);





    }

    private static void m8bytArray(String str) {
        byte [] bytArr = str.getBytes();
        System.out.println(Arrays.toString(bytArr));
        for (int l = 0, r=str.length()-1; r >l ; l ++, r--) {
            byte temp = bytArr[l];
            bytArr[l] = bytArr[r];
            bytArr[r]=temp;


        }

        System.out.println("m8 bytARR: "+new String(bytArr));
    }

    private static void m7ChrArray(String str) {
        char [] chrArr = str.toCharArray() ;
        System.out.print("m7 chrArray: ");
        for (int i = chrArr.length-1; i >=0 ; i--) {
            System.out.print(chrArr[i]);
        }
        System.out.println();;//dummy
    }

    private static void m6StrArray(String str) {
        String [] strArr = str.split("");
        System.out.print("m6 strArray: ");
        for (int i = strArr.length-1; i >=0 ; i--) {
            System.out.print(strArr[i]);
        }
        System.out.println();;//dummy
    }

    private static void m5StrBuffer(String str) {
        StringBuffer ss = new StringBuffer(str);
        System.out.println("sbuffer: "+ss.reverse());
    }

    private static void m4StrBuilder(String str) {
        StringBuilder ss = new StringBuilder(str);
        System.out.println("sbuilder: "+ss.reverse());
    }


    private static void m3while(String str) {
        String s5="";
        while (str.length()>0){
            s5+=str.charAt(str.length()-1);
            str=str.substring(0,str.length()-1);

        }
        System.out.println("s5: "+s5);
    }

    private static void m2FirstIndex(String str) {
        String s3="";
        String s4="";
        for (int i = 0; i < str.length() ; i++) {
            s3 = str.charAt(i)+s3;
            s4= str.substring(i,i+1)+s4;

        }

        System.out.println("s3: "+s3);
        System.out.println("s4: "+s4);
    }

    private static void m1lastIndex(String str) {
        String s1="";
        String s2="";
        for (int i = str.length()-1; i >=0 ; i--) {
            s1+=str.charAt(i);
s2+=str.substring(i,i+1);
        }
        System.out.println("s1: "+s1);
        System.out.println("s2: "+s2);
    }
}