import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		//With lib
        System.out.println(Math.round(Math.sqrt(input)));    		
        //With out libraray
        if (input == 1) {
            System.out.println(1);
        } else {
         for(int i=1; i<input/2; i++) {
           if (input == i*i) {
               System.out.println(i);
               break;
           } 
        }   
        }
	}
}
