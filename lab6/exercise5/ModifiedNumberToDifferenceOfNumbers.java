package lab6.exercise5;
import java.util.Scanner;
class ModifiedNumberToDifference {
int modifyNumber(String input){
		int output=0;
		char arr[]=input.toCharArray();
		StringBuffer os=new StringBuffer();
		os.append(arr[arr.length-1]);
		for(int i=arr.length-1;i>0;i--)
		{
		 int temp=Math.abs((int)arr[i]-(int)arr[i-1]);
		 os.append(temp);
		}
		os.reverse();
		output=Integer.parseInt(os.toString());
		return output;
	}
}
public class ModifiedNumberToDifferenceOfNumbers {
public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  ModifiedNumberToDifference obj=new ModifiedNumberToDifference();
		  System.out.println("Enter Number:");
		  String input=sc.nextLine();
		  System.out.println(obj.modifyNumber(input));
		     sc.close();
}
}
