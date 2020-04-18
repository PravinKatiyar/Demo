package lab2.abstractclasses;

import lab2.abstractclasses.AbstractWrittenItem;

public class JournalPaper extends AbstractWrittenItem 
{
    private String yearOfPublished;
    public JournalPaper(String yearOfPublished,int identificationNumber, int noOfCopies, String title,String author)
    {
    	super(identificationNumber,noOfCopies,title,author);
    	this.yearOfPublished=yearOfPublished;
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
	System.out.println("Publishing year : "+this.yearOfPublished);
	System.out.println("Identification Number : "+this.getIdentificationNumber());
	System.out.println("Number of copies : "+this.getNoOfCopies());
	System.out.println("Title : "+this.getTitle());
	System.out.println("Author : "+this.getAuthor());

	}
	}