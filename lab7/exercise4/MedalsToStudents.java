package lab7.exercise4;
import java.util.*;
class MedalsToStud 
{
  public HashMap<Integer,String> getStudents(HashMap<Integer,Integer> hm)
  {
	  HashMap<Integer,String> output=new HashMap<Integer,String>();
	  for(Map.Entry<Integer,Integer> me:hm.entrySet())
	  {
		  if(!output.containsKey(me.getKey()))
		  {
			 if(me.getValue()>=90)
			 {
				 output.put(me.getKey(), "Gold");
			 }
			 else if(me.getValue()>=80 && me.getValue()<90)
			 {
				 output.put(me.getKey(), "Silver");
			 }
			 else if(me.getValue()>=70 && me.getValue()<80)
			 {
				 output.put(me.getKey(),"Bronze");
			 }
		  }  
	  }
	  return output;
  }
}

public class MedalsToStudents {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		 System.out.println("Enter Size of student details:");
		 int n=scan.nextInt();
		 HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		 for(int i=0;i<n;i++)
		 {
			 System.out.print("Enter Student Id:");
			   int id=scan.nextInt();
			   System.out.println("Enter Marks of Student:");
			   int marks=scan.nextInt();
			   hm.put(id, marks);
		 }
		 MedalsToStud mts=new MedalsToStud();
		 HashMap<Integer,String> output=mts.getStudents(hm);
		 for(Map.Entry<Integer,String> me:output.entrySet())
		 {
			 System.out.println(me.getKey()+"-->"+me.getValue());
		 }
		

	}

}