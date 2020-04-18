package lab2.abstractclasses;
import java.util.Scanner;
public class MainContollerForVideo {

	public static void main(String[] args) {
			
			Scanner scan=new Scanner(System.in);
			 String director=scan.nextLine();
			 String genre=scan.nextLine();
			 String yearreleased=scan.nextLine();
			 String title=scan.nextLine();
			 int identificationNumber=scan.nextInt();
			 int noOfCopies=scan.nextInt();
			 int runTime=scan.nextInt();
			 Video v1=new Video(director,genre,yearreleased,title,identificationNumber,noOfCopies,runTime);
			  v1.print();
			 scan.close();
			}
	}


