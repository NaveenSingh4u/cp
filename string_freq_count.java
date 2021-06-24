import java.util.*;

//This program is used for printing char at given no of freq.
public class MyClass {

     public static void main(String []args){
        //Scanner sc = new Scanner(System.in);
        String str = "a1 b5 c8"; //sc.nextLine();
        String st[] = str.split(" ");
        int freq = 0;
        
        for (String s: st) {
            freq = Integer.parseInt(s.substring(1));
            for(int i=0; i<freq; i++) {
                System.out.print(s.charAt(0));
            }
            System.out.println(" ");
        }
     }
}