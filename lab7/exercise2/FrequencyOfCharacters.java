package lab7.exercise2;
import java.util.*;
class FrequencyOfChar 
{
  public Map<Character,Integer> countCharacter(char[] arr)
  {
	  Map<Character,Integer>output=new LinkedHashMap<Character,Integer>();
	  for(int i=0;i<arr.length;i++)
	  {
		  if(output.containsKey(arr[i]))
		  {
			  output.put(arr[i], output.get(arr[i])+1);
		  }
		  else
		  {
			  output.put(arr[i],1);
		  }
	  } return output;
  }}
public class FrequencyOfCharacters 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Size of character array length:");
		int n=scan.nextInt();
		char arr[]=new char[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.next().charAt(0);
		}
		FrequencyOfChar foc=new FrequencyOfChar();
	  Map<Character,Integer> lhm=foc.countCharacter(arr);
	  Iterator<Map.Entry<Character,Integer>> itr=lhm.entrySet().iterator();
	  System.out.print("[");
	    while(itr.hasNext())
	    {
	    	Map.Entry<Character, Integer>entry=itr.next();
	    	System.out.print("\'"+entry.getKey()+"\':"+entry.getValue()+" ,");
	    }
	    System.out.println("]");
		scan.close();
	}}