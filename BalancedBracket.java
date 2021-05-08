/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
C#, VB, Perl, Swift, Prolog, Javascript, Pascal, HTML, CSS, JS
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;

class Main
{
  public static void main (String[]args)
  {
    String str = "{[((()))]}";
      System.out.println (isBalancedBracket (str));
  }

  private static boolean isBalancedBracket (String str)
  {
    Deque < Character > stack = new ArrayDeque <> ();
    for (int i = 0; i < str.length (); i++)
      {
	char ch = str.charAt (i);
	if (ch == '{' || ch == '[' || ch == '(')
	  {
	    stack.push (ch);
	    continue;
	  }

	if (stack.isEmpty ())
	  {
	    return false;
	  }

	char check;

	switch (ch)
	  {
	  case ')':
	    check = stack.pop ();
	    if (check == '{' | check == '[')
	      {
		return false;
	      }
	    break;

	  case ']':
	    check = stack.pop ();
	    if (check == '{' | check == '(')
	      {
		return false;
	      }
	    break;
	  case '}':
	    check = stack.pop ();
	    if (check == '(' | check == '[')
	      {
		return false;
	      }
	    break;
	  }
      }
    //check empty String
    return (stack.isEmpty ());
  }
}
