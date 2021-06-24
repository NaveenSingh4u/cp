import java.util.*;

// This program is used for printing alternate min and max value of given
// array.
public class MyClass {

     public static void main(String []args){
        //Scanner sc = new Scanner(System.in);
        int[] arr = new int[] { 3,28,7,21,23,1,2,6,87,71, 91,11};
        
        List<Integer> al = new ArrayList();
        for (int i=0; i< arr.length; i++) {
            al.add(arr[i]);
        }
        
        Collections.sort(al);
        int n = arr.length;
        System.out.println(al);  
          
        for (int j=0; j<n/2; j++) {
              System.out.print(al.get(j)+" ");  
              System.out.print(al.get(n-j-1)+" ");  
        }
        
        if(n%2 == 1) {
              System.out.print(al.get(n/2)+" ");  
        }
     }
}