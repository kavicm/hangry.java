
package hangry;

/**
 *
 * @author MKavic
 */
public class Hangry {

    /*
     This class creates a program that will calculate the ACSII value of the 
     * word hangry 
     * /
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //The ASCII value is the sum of each letter's ASCII value
     
        String word = "hangry";
     
        char letter1 = word.charAt(0);
        int ascii1 = (int)letter1;
        char letter2 = word.charAt(1);
        int ascii2 = (int)letter2;
        char letter3 = word.charAt(2);
        int ascii3 = (int)letter3;
        char letter4 = word.charAt(3);
        int ascii4 = (int)letter4;
        char letter5 = word.charAt(4);
        int ascii5 = (int)letter5;
        char letter6 = word.charAt(5);
        int ascii6 = (int)letter6;
     
        int asciiTotal = (ascii1 + ascii2 + ascii3 + ascii4 + ascii5 + ascii6);
        //sum of the ascii value for each letter
     
        System.out.println("The ASCII value of hangry is " + asciiTotal);
    }
    
}
