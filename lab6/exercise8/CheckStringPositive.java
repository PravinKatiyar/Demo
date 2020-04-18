package lab6.exercise8;
import java.util.Scanner;
class CheckString {
public  boolean isPos(String input)
	{
		boolean ispos=true;
		input=input.toLowerCase();
		char arr[]=input.toCharArray();
		for(int i=1;i<arr.length;i++)
		{
		  if(!(arr[i]>arr[i-1]))
		  {
			  ispos=false;
		  }}
		return ispos;
	}}
public class CheckStringPositive {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String ");
		String s1=scan.nextLine();
		CheckString obj=new CheckString();
		boolean ispositive=obj.isPos(s1);
		if(ispositive)
			System.out.println("String is positive !!");
		else
			System.out.println("String is Negative!!");
		scan.close();

	}

}
