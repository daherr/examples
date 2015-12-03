/**
 * 
 */


import java.io.*;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * @author David Herr
 *
 */
public class Ex8_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/**
		 * @param args the command line arguments
		 * @throws IOException
		 */
			File myFile = new File( "myOutputFile.txt" );
			//PrintWriter outputFile;
			BufferedReader inputFile;
			Scanner keybd = new Scanner(System.in);
			String inputString;
			int inputInt;
			int c = 1;
			
			while( !myFile.exists() ){
				System.out.print( myFile.getName() + " does NOT EXIST. New name: " );
				inputString = keybd.nextLine();
				myFile = new File( inputString );
			}
			
			inputFile = new BufferedReader( new FileReader( myFile ));
			/*
			while( myFile.exists() ) {
				System.out.print( myFile.getName() + " exists. New name: " );
				inputString = keybd.nextLine();
				myFile = new File( inputString );
			}
			
			// outputFile = new PrintWriter( myFile );
			 */
			
			inputFile.mark(256);
			// do something silly
			while(  inputFile.ready() ){
				inputString = inputFile.readLine();
				System.out.println( "line [" + c++ +"] = " + inputString );
			}
			
			inputFile.reset();
			
			Stream<String> newStream;
			newStream = inputFile.lines();
			
			newStream.forEach( s -> System.out.println(s) );
			
			inputFile.close();
		}

	}
