package lab7.exercise3;
import java.util.*;
class SquaresOfNumber 
{
  public HashMap<Integer,Integer> getSquares(int input[])
  {
	  HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
	  for(int i=0;i<input.length;i++)
	  {
		  hm.put(input[i], input[i]*input[i]);
	  }
	  return hm;
  }}
public class SquaresOfNumberAndStoringInMap {
public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n=scan.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=scan.nextInt();
		SquaresOfNumber obj=new SquaresOfNumber();
		HashMap<Integer,Integer>hm=obj.getSquares(arr);
		Iterator<Map.Entry<Integer,Integer>> itr=hm.entrySet().iterator();
		while(itr.hasNext())
		{
			Map.Entry<Integer,Integer> entry=itr.next();
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		scan.close();
	}}
