class StringRotation {
	public static void main (String[] args) {
	String str = "Malyalam";
	//leftRotate(str,2);
	System.out.println(leftRotate(str,2));
	}
	static String rightRotate(String str, int noOfTimes) {
	    return str.substring(noOfTimes) + str.substring(0, noOfTimes);
	}
	static String leftRotate(String str, int noOfTimes) {
	    char[] charArr = str.toCharArray();
	    String result = "";
	    for (int i=charArr.length-noOfTimes; i<charArr.length;i++) {
	        result += String.valueOf(charArr[i]);
	    }
	    for (int i=0; i<charArr.length-noOfTimes;i++) {
	        result += String.valueOf(charArr[i]);
	    }
	    return result;
	}
	
}