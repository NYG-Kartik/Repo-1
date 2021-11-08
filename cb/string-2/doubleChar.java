public class doubleChar {
	public static String doubleChar (String str) {
		int len = str.length();
		String newstr = "";
		for (int i = 0; i < len; i++) {
		newstr += str.substring(i,i+1) + str.substring(i, i+1);		
		}
		return newstr;
}
public static void main (String[] args) {
	System.out.println(doubleChar("The"));
	System.out.println(doubleChar("AAbb"));
	System.out.println(doubleChar("Hi-There"));
}}

