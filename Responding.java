import java.util.*;
public class Responding {
    public static void main(String args[]) {
        //Normal
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Name:");
        String name = scan.nextLine();
        System.out.println("Whoa! " + name + " is my name, too!\nWhat are the odds!?!");
        
        //Advanced
        System.out.println("Enter Name:");
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        String name1 = sc.nextLine();
        int num = 0;
        while(num < 75) {
        num = rand.nextInt(100);
        if(num < 25) {
            System.out.println("Hi, " + name1 + ". My name is Computer Bot!");
        } else if(num < 50) {
            System.out.println("Howdy Partner. My name is " + name1 + ".");
        } else if(num < 75) {
            System.out.println("What's up, " + name1 + "? My name is Computer Bot!");
        } else {
            System.out.println("WHOA!!! " + num + " is a big number for someone like " + name1 + "!");
        }
        }
    }
}
