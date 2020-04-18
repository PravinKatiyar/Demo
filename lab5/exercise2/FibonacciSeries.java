package lab5.exercise2;
import java.util.Scanner;
class Fibonacci {

	public int getNthFibonacciNormal(int n)
	{
	  int NthDigit=0,first=1,second=1,temp=0;
	  for(int i=0;i<n-2;i++)
	  {
		   temp=first+second;
		  first=second;
		  second=temp;
	  }
	   NthDigit=temp;
	  return NthDigit;
	}
	
	public int getNthFibonacciRecursiveMethod(int first,int second,int n)
   {
	    if(n==2)
	    	return second;
	    else
	    	n--;
	    	return getNthFibonacciRecursiveMethod(second,first+second,n);
   }	
}

public class FibonacciSeries {
public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
Fibonacci obj=new Fibonacci();
System.out.println("Fibonacci Series using Normal Function:"+obj.getNthFibonacciNormal(scan.nextInt()));
System.out.println("Fibonacci Series using Recursive method:"+obj.getNthFibonacciRecursiveMethod(scan.nextInt(),scan.nextInt(),scan.nextInt()));
scan.close();
}}
