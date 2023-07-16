package String;

public class JoinStrings {
	public static void main(String[]args) {
		String result=JoinStrings("Hello,","World!");
		System.out.println(result);
		
	}
   public static String JoinStrings(String str1,String str2) {
	   String result=str1+str2;
	   return result;
   }
   
}
