package exceptionbasics;

// Java core packages
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
// Java extension packages
import javax.swing.*;

/**
 * DivideByZeroTest class uses the DivideByZeroException class to
 * demonstrate the use of a custom exception class. Note that this
 * class (DivideByZeroTest) is the driver, and DivideByZeroException
 * is the custom exception class.
 * <p>
 * Pay special attention to the actionPerformed() method, and
 * specifically the tryh-catch block within. What happens when the
 * method quotient() is called on line 70?
 */
public class DivideByZeroTest extends JFrame
   implements ActionListener {

   private JTextField inputField1, inputField2, outputField;
   private int number1, number2;
   private double result;

   // set up GUI
   public DivideByZeroTest()
   {
      super( "Demonstrating Exceptions" );

      // get content pane and set its layout
      Container container = getContentPane();
      container.setLayout( new GridLayout( 3, 2 ) );

      // set up label and inputField1
      container.add( 
         new JLabel( "Enter numerator ", SwingConstants.RIGHT ) );
      inputField1 = new JTextField( 10 );
      container.add( inputField1 );

      // set up label and inputField2; register listener
      container.add( 
         new JLabel( "Enter denominator and press Enter ",
            SwingConstants.RIGHT ) );
      inputField2 = new JTextField( 10 );
      container.add( inputField2 );
      inputField2.addActionListener( this );

      // set up label and outputField
      container.add( 
         new JLabel( "RESULT ", SwingConstants.RIGHT ) );
      outputField = new JTextField();
      container.add( outputField );

      setSize( 425, 100 );
      setVisible( true );
   }

   // process GUI events
   public void actionPerformed( ActionEvent event )
   {
      DecimalFormat precision3 = new DecimalFormat( "0.000" );

      outputField.setText( "" );   // clear outputField

      // Read two numbers and calculate quotient. An exception
      // will be thrown here -- what kind, and where will it
      // be caught? Think carefully about this one!
      try {
         if(inputField1.getText() == null || inputField2.getText() == null
                 || inputField1.getText().length() == 0
                 || inputField2.getText().length() == 0)
         {
             throw new MandatoryEntryException();
         }
         number1 = Integer.parseInt( inputField1.getText() );
         number2 = Integer.parseInt( inputField2.getText() );

         result = quotient( number1, number2 );
         outputField.setText( precision3.format( result ) );
      }

      // process improperly formatted input
      catch ( MandatoryEntryException mee ) {
         JOptionPane.showMessageDialog( this,
            mee.getMessage(),
            "Data Entry Error",
            JOptionPane.ERROR_MESSAGE );
      }

      // process improperly formatted input
      catch ( IllegalArgumentException iae ) {
         JOptionPane.showMessageDialog( this,
            "You must enter two integers",
            "Invalid Number Format",
            JOptionPane.ERROR_MESSAGE );
      }

      // process attempts to divide by zero
      catch ( ArithmeticException arithmeticException ) {
         JOptionPane.showMessageDialog( this, 
            arithmeticException.getMessage(),
            "Arithmetic Exception",
            JOptionPane.ERROR_MESSAGE );
      }
   }

   // method quotient demonstrates throwing an exception
   // when a divide-by-zero error occurs
   public double quotient( int numerator, int denominator )
      throws DivideByZeroException
   {
      if ( denominator == 0 )
         throw new DivideByZeroException();
		 //throw new DivideByZeroException("Custom divide by zero message.");

      return ( double ) numerator / denominator;
   }

   // execute application
   public static void main( String args[] )
   {
      DivideByZeroTest application = new DivideByZeroTest();

      application.setDefaultCloseOperation(
         JFrame.EXIT_ON_CLOSE );
   }

}  // end class DivideByZeroTest
