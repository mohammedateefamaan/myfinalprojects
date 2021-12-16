import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
class fileHandling
{
	public static void main(String arg[])
	{
		char functions;
		char function1;
	Scanner sc=new Scanner(System.in);
	//creating main folder
	{
		File folder=new File("C:\\Users\\Ateef Amaan\\OneDrive\\Desktop\\folder1");
		folder.mkdir();
	}
	//creating file inside a folder and printing welcome screen and application functions
	{
		File folder1=new File("C:\\Users\\Ateef Amaan\\OneDrive\\Desktop\\folder1\\first.txt");
		try {
		folder1.createNewFile();
		} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
	}
	{
		File folder=new File("C:\\Users\\Ateef Amaan\\OneDrive\\Desktop\\folder1\\first.txt");
		try {
		FileWriter fw = new FileWriter(folder);
		fw.write("*************************************WELCOME************************************** \n \n");
		fw.write("FUNCTIONING OF APPLICATION:- WORKING OF FILE HANDLING");
		fw.close();
		} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
	}
	//Creating more files inside a main folder(folder1)
	{
		File folder11=new File("C:\\Users\\Ateef Amaan\\OneDrive\\Desktop\\folder1\\uploading.txt");
		try {
		folder11.createNewFile();
		} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
	}
	
	{
		File folder12=new File("C:\\Users\\Ateef Amaan\\OneDrive\\Desktop\\folder1\\downloading.txt");
		try {
		folder12.createNewFile();
		} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		
	{
		File folder13=new File("C:\\Users\\Ateef Amaan\\OneDrive\\Desktop\\folder1\\Forwording.txt");
		try {
		folder13.createNewFile();
		} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		}
	}
	
	{
		File folder14=new File("C:\\Users\\Ateef Amaan\\OneDrive\\Desktop\\folder1\\searching1.txt");
		try {
		folder14.createNewFile();
		} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
	}
	
	{
		File folder15=new File("C:\\Users\\Ateef Amaan\\OneDrive\\Desktop\\folder1\\searching2.txt");
		try {
		folder15.createNewFile();
		} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
	}
	
	{
		File folder16=new File("C:\\Users\\Ateef Amaan\\OneDrive\\Desktop\\folder1\\searching3.txt");
		try {
		folder16.createNewFile();
		} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
	}
		
	// Display Initial Main menu and take user inputs
	String InitialMainMenu=("Initial Main Menu:\n"
			+ "1. Retrieving all files in a folder and displaying in ascending order.\n"
			+ "2. Display Secondary Menu for performing File Operations by taking userinput.\n"
			+ "3. For terminating the application.");
	System.out.println(InitialMainMenu);
	System.out.println();
	System.out.println(" Choose and enter any option from Initial Main Menu");
	functions = sc.next().charAt(0);

	
	switch(functions)
	{	//Retrieving files from main folder
		case '1':
			System.out.println("Retrieved files from main folder_(Folder1) are :");
			System.out.println();
			File fl=new File("C:\\Users\\Ateef Amaan\\OneDrive\\Desktop\\folder1");
			File array[]=fl.listFiles();
			for(int i=0;i<array.length;i++)
			{
				System.out.println(array[i]);
			}
			break;
		// Creating Secondary Main Menu and taking user inputs
		case '2':
			String SecondaryMainMenu=("Secondary Main Menu:\n"
					+ "1. Allow user to add file to main folder by taking input of folder name.\n"
					+ "2. Allow user which file to delete, from main folder.\n"
					+ "3. Allow user to specify input of filename and show the respective files starting with the given name.\n"
					+ "4. Return to previous Main Menu.\n"
					+ "5.  For Terminating the application.");
			System.out.println(SecondaryMainMenu);
			System.out.println();
			System.out.println(" Choose and enter any option from Secondary Main Menu");
			function1=sc.next().charAt(0);
			switch(function1)
			{
			//ADDING  file inside a folder using user input
			case '1':
				System.out.println("Enter file name to add :");
				String jpg = sc.next();
				File fl1=new File("C:\\Users\\Ateef Amaan\\OneDrive\\Desktop\\folder1\\"+ jpg);
				try {
					fl1.createNewFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			break;
			
			//DELETION of file from a folder using user input
			case '2':
				System.out.println("Files inside a main folder(Folder1): \n" + "1.uploading.txt \n" + "2.downloading.txt \n" + "3.forwording.txt \n" + "4.helping.txt \n" + "5.searching1.txt \n" + "6.searching2.txt \n" + "7.searching3.txt \n");
				System.out.println();
				System.out.println("Enter which name to delete from above files of main folder:");
				String jpg1 = sc.next();
			File fl2=new File("C:\\Users\\Ateef Amaan\\OneDrive\\Desktop\\folder1\\" + jpg1);
			System.out.println(fl2.delete());
			break;
			
			//Showing respective files starting with given name- (searching.txt)
			case '3':
				System.out.println("Enter file name to search with starting name:");
				File fl3=new File("C:\\Users\\Ateef Amaan\\OneDrive\\Desktop\\folder1");
				File array1[]=fl3.listFiles();
				String name=sc.next();
				for(int i=0;i<array1.length;i++)
				{
					if(array1[i].getName().startsWith(name))
					{
						System.out.println(array1[i]);
					}
				}
			break;
			
			//Returning back to previous menu
			case '4':
				System.out.println(InitialMainMenu);
			break;
			
			//Terminating an Application
			case '5':
				System.out.println("successfully terminated the application.");
			break;
			
			default :
				System.out.println("Invalid option entered!!!Retry againn");
				System.out.println();
				System.out.println(SecondaryMainMenu);
			break;
			}
	
		break;
		
		//Terminating an application
		case '3':
			System.out.println("successfully terminated the application0.");
		break;
		default :
			System.out.println("Invalid option entered!!!!Retry again?");
			System.out.println();
			System.out.println(InitialMainMenu);
			
		}

	}
	}
	