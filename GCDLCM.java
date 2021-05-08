class LCMGCD {
	public static void main (String[] args) {
		int num1= 60,num2=75;
		System.out.println(gcd(num1,num2));
		System.out.println(lcm(num1,num2));
	}
	
	static int gcd(int a, int b) {
	    if (a==0) {
	        return b;
	    }
	    return gcd(b%a, a);
	}
	
	static int lcm(int a, int b) {
	    return (a/gcd(a,b))*b;
	}
}