package lab6.exercise4;
import java.util.Scanner;
class ReplaceWithNextCharcter {
public  String alterString(String input)
	{
	  StringBuffer output=new StringBuffer();
	  char arr[]=input.toCharArray();
	  for(int i=0;i<arr.length;i++)
	  {
	if(arr[i]=='a' || arr[i]=='A' || arr[i]=='e' || arr[i]=='E' || 
	arr[i]=='i' || arr[i]=='I' || arr[i]=='o' || arr[i]=='O' || arr[i]=='u' || arr[i]=='U' || arr[i]==' ')
		  {
		  output.append(arr[i]);	  
		  }
	else
		  {
			  int num1=(int)arr[i];
			  if(num1==90)
				  output.append((char)65);
			  else if(num1==122)
				  output.append((char)97);
			  else
				  output.append((char)++num1);
		  }
	  }
	  return output.toString();
	}
}
public class ReplaceConsonentsInStringWithNextCharcter {
public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String input=scan.nextLine();
		ReplaceWithNextCharcter obj=new ReplaceWithNextCharcter();
		System.out.println(obj.alterString(input));
		 scan.close();
	}
}