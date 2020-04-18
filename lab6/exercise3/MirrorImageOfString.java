package lab6.exercise3;
import java.util.Scanner;
class MirrorImage{
public String getImage(String input) 
	{
		StringBuffer interm=new StringBuffer();
		  interm.append(input);
		  interm.reverse();
		  StringBuffer output=new StringBuffer();
		      output.append(input+"|"+interm);
		  return output.toString();
	}
}
public class MirrorImageOfString {

	public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Enter String:");
		 String s1=scan.nextLine();
		 MirrorImage obj=new MirrorImage();
		 System.out.println(obj.getImage(s1));
		 scan.close(); 
	}

}
