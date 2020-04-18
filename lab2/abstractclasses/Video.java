package lab2.abstractclasses;
import lab2.abstractclasses.AbstractMediaItem;
public class Video extends AbstractMediaItem
{
  private String director,genre,yearreleased;
    public Video(String director,String genre,String yearreleased,String title,int identificationNumber,int noOfCopies,int runTime)
    {
    	super(identificationNumber,noOfCopies,title,runTime);
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
	System.out.println("Director's name : "+this.director);
	  System.out.println("Genre : "+this.genre);
	System.out.println("Identification Number : "+this.getIdentificationNumber());
	System.out.println("Number of copies : "+this.getNoOfCopies());
	System.out.println("Title : "+this.getTitle());
	//System.out.println("Run time : "+this.getRunTime());
	}
}
