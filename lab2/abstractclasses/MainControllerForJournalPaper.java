package lab2.abstractclasses;
import java.util.Scanner;

public class MainControllerForJournalPaper {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Please provide details in following order : ");
		System.out.println("Year of publishing : ");
		 String yearOfPublished=scan.nextLine();
		 System.out.println("Author name : ");
		 String author=scan.nextLine();
		 System.out.println("Title : ");
		 String title=scan.nextLine();
		 System.out.println("Identification number : ");
		 int identificationNumber=scan.nextInt();
		 System.out.println("No. of copies : ");
		 int noOfCopies=scan.nextInt();
		 System.out.println("Run time : ");
		 int runTime=scan.nextInt();
		 JournalPaper jp=new JournalPaper(yearOfPublished,identificationNumber,noOfCopies,title,author);
		  jp.print();
		 scan.close();
		}

}
