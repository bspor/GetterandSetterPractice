package exceptionbasics;

/**
 * A trivial yet functional example of a custom exception class.
 * Notice three versions of the constructor are provided.
 * 
 * @author Jim Lombardo
 */
public class MandatoryEntryException extends Exception {
	// No magic numbers!!
	private final static String MSG = "You must enter a value for all input fields";
	private Exception cause;
	
	/**
	 * Default constructor passes meaningfull message to super class
	 */
	public MandatoryEntryException() {
		// doing this provides our custom text to the inherited toString() and getMessage() methods
		super(MSG);
	}
	
	/**
	 * Creates an exception with information about a data entry problem.
	 *  
	 * @param missingDataInfo - a String representing a mandatory input field by name or description
	 */
	public MandatoryEntryException(String missingDataInfo) {
		// doing this provides our custom text to the inherited toString() and getMessage() methods
		super(MSG);
	}
	
	/**
	 * Creates a new exception with information about a data entry problem and captures the original exception.
	 *  
	 * @param missingDataInfo - a String representing a mandatory input field by name or description
	 * @param cause - the original Exception that caused this exception to be thrown.
	 */
	public MandatoryEntryException(String missingDataInfo, Exception cause) {
		// doing this provides our custom text to the inherited toString() and getMessage() methods
		super(MSG);
	}

}
