public class Main
{
	public static void main(String[] args) {
		String str = "hbhhhfjjcccc";
		String res = "";
		for (int i=0; i< str.length(); i++) {
		    if (!res.contains(String.valueOf(str.charAt(i)))) {
		        res += String.valueOf(str.charAt(i));
		    }
		}
		System.out.println(res);
	}
}