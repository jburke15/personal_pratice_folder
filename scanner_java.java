import java.util.Scanner;

public class scanner_java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        System.out.println("jami will you be my valentine ?");
       
       String userName = scanner.nextLine();
        if(userName.equals("no")) {      
         System.out.println("i will self destruct in 30 seconds");
        }
        
        if(userName.equals("yes")) {      
         System.out.println("Good cos you wouldnt wanna know what would happen if you said no...");
        }

        //System.out.println("Good cos you wouldnt wanna know what would happen if you said no...   say no one time"); // Output user input
    }
}
