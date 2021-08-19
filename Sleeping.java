import java.util.*;
public class Sleeping {
    public static void main(String[] args) {
        System.out.println("Enter something cool!");
        String cool = (new Scanner(System.in)).nextLine();
        try {
            Thread.sleep(500); //Sleeps for 0.5 seconds (500 milliseconds)
            System.out.print(cool + "?"); //Doesn't print a new line
            Thread.sleep(1500); //Sleeps for 1.5 seconds
            System.out.println(" THAT IS COOL!");
        } catch(Exception e) {
            System.err.println("OOF... an error happened. Here it is: " + e);
        }
    }
}
