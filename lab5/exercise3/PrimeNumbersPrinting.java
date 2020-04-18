package lab5.exercise3;
import java.util.Scanner;

class PrimeNumbers {

	void printPrimeNumbers(int n)
    {
   	 
       for(int i=2;i<=n;i++)
       {
       	boolean isPrime=true;
          for(int j=2;j<=(int)Math.sqrt(i);j++)
          {
       	   if(i%j==0 && i!=2)
       		   isPrime=false;
          }
          if(isPrime)
       	   System.out.println(i);
       }
    }
}
public class PrimeNumbersPrinting
{
public static void main(String[] args) 
	{
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Enter Number :");
	       int n=scan.nextInt();
	       PrimeNumbers obj=new PrimeNumbers();  
	       obj.printPrimeNumbers(n);
	       scan.close();

	}

}