package may24;

import java.io.File;
import java.io.IOException;

public class FileDemo1{
public static void main(String args[]) throws IOException{
	
	File f=new File("C:\\Users\\DELL\\OneDrive\\Desktop\\SeleniumAutomation\\Padhu.txt");

	f.createNewFile();
	System.out.println("File Created!!");
	
	
	
}}