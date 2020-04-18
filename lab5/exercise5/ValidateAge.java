package lab5.exercise5;
import java.util.Scanner;
class Age{
	
	void verify(int age) {
		try {
			if(age<15) throw new ArithmeticException("Age of person should be above 15");
			System.out.println("Age has been Succesfully Verified");
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
}
public class ValidateAge {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		int age=scan.nextInt();
		Age obj=new Age();
		obj.verify(age);

	}

}
