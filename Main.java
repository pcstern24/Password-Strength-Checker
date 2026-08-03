import java.util.Scanner;

/** 
  * Main class for Password Strength Checker 
  * Prompts the user for a password and starts analysis 
  */
public class Main {

    public static void main(String[] args) {

        // Create Scanner to read user input 
        Scanner stdin = new Scanner(System.in);
        
        // Prompt the user to enter a password 
        System.out.print("Enter a password: ");
        String password = stdin.nextLine();

        // Create a Password Analyzer object
        PasswordAnalyzer analyzer =
                new PasswordAnalyzer(password);

        // Perform the password analysis
        analyzer.analyze();     
    }
}
