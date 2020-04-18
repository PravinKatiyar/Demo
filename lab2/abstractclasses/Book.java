package lab2.abstractclasses;

import lab2.abstractclasses.AbstractWrittenItem;

public class Book extends AbstractWrittenItem{

	public Book(int identificationNumber, int noOfCopies, String title, String author) {
		super(identificationNumber, noOfCopies, title, author);
		// TODO Auto-generated constructor stub
	}
    
	@Override
	public void checkOut()
	{
	 System.out.println("Total No.of Copies:->"+this.getNoOfCopies());
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
	System.out.println("Identification Number : "+this.getIdentificationNumber());
	System.out.println("Number of copies : "+this.getNoOfCopies());
	System.out.println("Title : "+this.getTitle());
	System.out.println("Author : "+this.getAuthor());
	}
	
	
}
