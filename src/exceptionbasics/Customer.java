package exceptionbasics;

import java.util.regex.Matcher;
import javax.swing.JOptionPane;

public class Customer {
    private String state;
    private String ssn;

    public String getState() {
        return state;
    }

    /**
     * A method that sets the state for this customer.
     * @param state - a two-character abbreviation for state
     * @throws IllegalArgumentException if state is not 2 characters in length
     */
    public void setState(String state) throws IllegalArgumentException {

        if(state == null || state.length() != 2) {
            throw new IllegalArgumentException (
                    "state must be 2 characters in length");

        }
        this.state = state;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) throws IllegalArgumentException {
        ssn = ssn.replaceAll("-", "");
        char[] chars = ssn.toCharArray();
        
        
        //Matcher m = p.matcher("aaaaab");
         if(ssn == null) {
            throw new IllegalArgumentException (
                    "state must be 2 characters in length");
         } else {
             String [] pieces = ssn.split("-");
             
             if (ssn.contains("-") && pieces.length !=3) {
                 throw new IllegalArgumentException("must have two hyphens");
             }
             for(char c : chars ) {
                 if (!Character.isDigit(c)) {
                     throw new IllegalArgumentException("must have digits");
                 }
             }
        }
        this.ssn = ssn;
    }

    
}
