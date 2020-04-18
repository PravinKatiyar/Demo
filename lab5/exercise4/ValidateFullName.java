package lab5.exercise4;
import java.util.Scanner;

class ValidateName{
	
	void verify(String fname,String lname){
		try {
			if(fname.length()==0 || lname.length()==0) throw new Exception("Unable to Validate name");
			System.out.println("First name as "+fname+"\nLast Name as"+lname+" is validated");

		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}


public class ValidateFullName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String fname=scan.nextLine();
		String lname=scan.nextLine();
		ValidateName obj=new ValidateName();
		obj.verify(fname, lname);

	}

}
