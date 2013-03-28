package exceptionbasics;

public class Syntax {
    public static void main(String[] args) {

        try {
            String s = null;
            int len = s.length();
        } catch(NullPointerException npe) {
            System.out.println("Sorry s is null, you cannot get it's length");
        } catch(Exception e) {

        } finally {
            
        }
    }
}
