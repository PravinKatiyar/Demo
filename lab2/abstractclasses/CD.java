package lab2.abstractclasses;
import lab2.abstractclasses.AbstractMediaItem;

public class CD extends AbstractMediaItem
{
  private String artistName,genre;
  
     public CD(String artistName,String genre,int identificationNumber, int noOfCopies, String title,int runTime)
     {
    	 super(identificationNumber,noOfCopies,title,runTime);
    	 this.artistName=artistName;
    	 this.genre=genre;
     }
     @Override
 	public void checkOut()
 	{
 		
 	}
 	
 	@Override
 	public void checkIn()
 	{
 		
 	}
 	@Override
 	public void addItem()
 	{
 		
 	}
 	@Override
 	public void print()
 	{
 	  System.out.println("Artist name : "+this.artistName);
 	  System.out.println("Genre : "+this.genre);
 	System.out.println("Identification Number : "+this.getIdentificationNumber());
 	System.out.println("Number of copies : "+this.getNoOfCopies());
 	System.out.println("Title : "+this.getTitle());
 	//System.out.println("Run time : "+this.getRunTime());
 	}
}
