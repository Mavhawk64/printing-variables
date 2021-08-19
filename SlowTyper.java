import java.util.*;
public class SlowTyper {
    public static void main(String[] args) {
        System.out.println("Enter something cool!");
        String cool = (new Scanner(System.in)).nextLine();
        typeItSlowly(cool);
    }
    
    public static void typeItSlowly(String input) {
        try {
            String myOutput = input + "? That is cool!";
            char[] outAsArr = myOutput.toCharArray();
            for(int i = 0; i < outAsArr.length; i++) {
                Thread.sleep(100);
                System.out.print(outAsArr[i]);
            }
            System.out.println();
        } catch(Exception e) {
            System.err.println("OOF... an error happened. Here it is: " + e);
        }
    }
}
