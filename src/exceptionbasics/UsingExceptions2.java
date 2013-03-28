package exceptionbasics;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 * UsingExceptions2 demonstrates how to pass (throws) an Exception 
 * to a calling method and handle it there.
 */
public class UsingExceptions2 {
	private int[] ints = {1,2,3,4};
	
	   // execute application
	   public static void main( String args[] )
	   {
		   UsingExceptions2 obj = new UsingExceptions2();
		   
	      // call method throwException
	      try {
	         obj.getInts();
	      }

	      // catch Exceptions thrown by method throwException
	      catch ( Exception exception )
	      {
	         System.err.println( "IndexOutOfBoundsException thrown in getInts() and handled by calling method (main)" );
	      }

	      System.out.println("main method completed");
	   }

	   // demonstrate a method that causes an Exception (unchecked) but does not handle it locally
	   // ... instead, it passes (throws) the Exception to the calling method
	   public void getInts() throws Exception
	   {
		   	 System.out.println( "getInts() method called..." );

			 // This will cause an IndexOutOfBoundsException (unchecked)
			 // Processing stops at the point where the Exception is thrown
			 for(int i=0; i < ints.length+1; i++) {
				 int value = ints[i];
			 }
			 
			 System.out.println("This line #41 can never be reached and is never excecuted in getInts().");
             File file = new File("myfile.txt");
             PrintWriter pw = new PrintWriter(file);

	   }

	}  // end class UsingExceptions2