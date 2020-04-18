package lab5.exercise6;
public class Employee {
	public static void main(String[] args) {
		int salary=2000;
		Employeex emp1=new Employeex();
		emp1.checksalary(salary);
		
	}

}

class Employeex{
void checksalary(int sal) {
	  try {
		  if(sal<3000)throw new SalaryException();
		  else {
			  System.out.println(sal);
		  }
	  }
	  catch(SalaryException e)
	  {
		  e.getMessage();
	  }
   
}
}