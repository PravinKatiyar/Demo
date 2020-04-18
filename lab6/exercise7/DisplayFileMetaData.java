package lab6.exercise7;
import java.io.File;
import java.util.Scanner;
public class DisplayFileMetaData {
	public static void main(String[] args) 
	{
     Scanner scan=new Scanner(System.in);
     getMetadata(scan.nextLine());
     scan.close();
	}
		public static void getMetadata(String path)
	{
		File file=new File(path);
		if(file.exists())
			System.out.println("file exists on the System");
		else 
			System.out.println("file does not exist");
		if(file.canRead())
			System.out.println("file is Readable");
		else 
			System.out.println("file cannot be readable!!");
		if(file.canWrite())
			System.out.println("file is Writable");
		else
			System.out.println("File is not writable!!");
		System.out.println("This file is of type:"+file.getName());
		System.out.println("File Size:"+file.length()+" bytes");
	}
}
