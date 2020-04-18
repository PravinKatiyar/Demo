package lab7.exercise1;
import java.util.*;
class SortHashM {
public List<Integer> getValues(HashMap<Integer,Integer> hm)
	{
		List<Integer> ll=new ArrayList<Integer>();
		//traversing through EntrySet
		for(Map.Entry<Integer,Integer> me:hm.entrySet())
		{
			ll.add(me.getValue());
		}
		Collections.sort(ll);
		return ll;
	}
}
public class SortHashMap {
public static void main(String[] args) {
	System.out.println("Enter Size of Array:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		 for(int i=0;i<n;i++)
		 {
			 System.out.print("Enter Any number to map:");
			 hm.put(i, sc.nextInt());
		 }
		 SortHashM obj=new SortHashM();
		 List<Integer> output=obj.getValues(hm);
		 System.out.println(output);

	}

}
