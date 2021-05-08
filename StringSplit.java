/*package whatever //do not write package name here */

import java.io.*;

class StringSplit {
	public static void main (String[] args) {
		String str = "I love my india";
		String[] result = str.split(" ");
		String output = " ";
		for(int i=result.length; i>0; i--) {
		    output +=" "+ result[i-1];
		}
		System.out.println(output.trim());
	}
}

//Note 
//For Splitting with .(Dot)  .split("\\.")