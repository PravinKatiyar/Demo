package lab2.abstractclasses;
import java.util.Scanner;
public class MainControllerForCD {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		 String artistName=scan.nextLine();
		 String genre=scan.nextLine();
		 String title=scan.nextLine();
		 int identificationNumber=scan.nextInt();
		 int noOfCopies=scan.nextInt();
		 int runTime=scan.nextInt();
		 CD cd=new CD(artistName,genre,identificationNumber,noOfCopies,title,runTime);
		  cd.print();
		 scan.close();
		}

}
