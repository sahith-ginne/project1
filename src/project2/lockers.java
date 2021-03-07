package project2;

import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.util.Arrays;
public class lockers {
	public static void main(String[]args) {
		System.out.println("Lockers.Pvt.Ltd");
		System.out.println("Developed by Sahith\n");
		Scanner input = new Scanner(System.in);
		int i=0;
		while(i<4) {
			System.out.println("1.Create a directory for clients");
			System.out.println("2.client details");
			System.out.println("3.Manage client details");
			System.out.println("4.exit\n");
			String enterkey = input.next();
			switch(enterkey) {
			case "1" : System.out.println("Make a directory\n");
			try{
			File folder= new File("E://sahith");
			if(folder.mkdir()) {
				System.out.println("folder created\n");
			}
			else  {
				if(folder.exists()) {
					System.out.println("folder exists\n");
				}
			}
			File dir = new File("E://sahith");
			File[] files=dir.listFiles();
			Arrays.sort(files,(f1,f2)  -> f1.compareTo(f2));
			System.out.println("present list of files");
			for(File file:files){
				System.out.println(file.getName());
			}
			}finally{
				System.out.println("\n");
			}
			break;
			case "2" : System.out.println("Create Client files");
			int j=0;
			while(j<2){
			System.out.println("Enter Client name");
			try{
				Scanner input1 = new Scanner(System.in);
			File file = new File("E://sahith",input1.next());
			if(file.createNewFile()) {
			System.out.println(file.getName()+  "is file created");
			}
			else {
				if(file.exists()){
					j=j-1;
					System.out.println("file already exists");
				}
			}
			}
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{	
			}
			j++;
			}
			break;
			case "3": System.out.println("manage files");
			int l=0;
			while(l<4) {
			System.out.println("1.add new file");
			System.out.println("2.search for a file");
			System.out.println("3.delete a file");
			System.out.println("4.back to main manu");
			try {
				String enterkey1= input.next();
				switch(enterkey1) {
				case "1" : System.out.println("1.Add new files");
				int k=0;
				while(k<2){
					System.out.println("enter new name");
					try{
						Scanner input1= new Scanner(System.in);
						File file = new File("E://sahith",input1.next());
						if(file.createNewFile()) {
							System.out.println("new file created");
						}
						else {
							if(file.exists()) {
								k=k-1;
								System.out.println("file already exists");
							}
						}
						k++;
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}finally{
					}
				}
				break;
				case "2" : System.out.println("search for a file");
				try{
					Scanner input1=new Scanner(System.in);
					File file=new File("E://sahith",input1.next());
					if(file.exists()) {
						System.out.println("file found");
					}
					else {
						System.out.println("file not found");
					}
				}finally{		
				}
				break;
				case "3" : System.out.println("enter a file name to delete");
				try{
					Scanner input1= new Scanner(System.in);
					File file= new File("E://sahith",input1.next());
					if(file.delete()) {
						System.out.println("file deleted");
					}
					else {
						System.out.println("file not found");
					}	
				}finally {
				}
				break;
				case "4" : 
				try{
				l=5;
				}finally{	
				}
				break;
				default:
					try  {
					System.out.println("you enter wrong option.please enter again");
					}finally {
						
					}
				}
					
			}
			finally {	
			}
			}
			l++;
			break;
			case "4" : System.out.println("exit");
				System.out.println("Enter y for exit");
				System.out.println("Enter n to go back to main menu");
				String enterkey2= input.next();
				switch(enterkey2) {
				case "n" : 
					try {
						Scanner input2 = new Scanner(System.in);
						break;
					}finally {
					}
				case "y" : 
					try {
						Scanner input2 = new Scanner(System.in);
						return;
					}finally {
						System.out.println("thank you");
					}
				}
			}	
		}	
	}
}
