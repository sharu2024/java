package Message;

import java.util.Scanner;
public class MessagaeDecoderAPP {
 public static void main(String[]args) {
	 
	 Scanner scan=new Scanner(System.in);
	 System.out.println("enter character");
	 char ch=scan.next().charAt(0);
	 MessageDecoder md= new MessageDecoder();
	 System.out.println(md.decodeCharacter(ch));
 }
}
