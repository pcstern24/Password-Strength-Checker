/** 
  * Analyzes a password and determines what affects 
  * password strength
  */
public class PasswordAnalyzer {

    private String password;

    /** 
      * Creates a PasswordAnalyzer object 
      *
      * @param password the password to analyze
      */
    public PasswordAnalyzer(String password) {
        this.password = password;
    }

    /** 
      * Analyzes a password and prints information about it 
      */
    public void analyze() {

        double entropy =
                EntropyCalculator.calculateEntropy(password);

        double offline =
                CrackTimeEstimator.offlineSeconds(entropy);

        double online =
                CrackTimeEstimator.onlineSeconds(entropy);

        System.out.println("Password: " + password);
        System.out.printf("Estimated entropy: %.0f bits%n", entropy);

        System.out.println();
        System.out.println("Estimated crack time:");
        System.out.println("Offline attack: " +
                TimeFormatter.format(offline));
        System.out.println("Online attack: " +
                TimeFormatter.format(online));

        System.out.println();
        System.out.println("Strength: " +
                StrengthEvaluator.getStrength(entropy));
    }
}
