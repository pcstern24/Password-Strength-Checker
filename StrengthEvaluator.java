/**
  * Evaluates the entropy strength of the given password
  */
public class StrengthEvaluator {

    /**
      * Prints the entropy strength of given password
      * 
      * @param entropy the calculated entropy value of the password
      * @return a message about the strength of the password
      */
    public static String getStrength(double entropy) {

    
        if (entropy < 28) {
            return "Very weak";
        } 
        
        if (entropy < 36) {
            return "Weak";
        }

        if (entropy < 60) {
            return "Moderate";
        }

        if (entropy < 80) {
            return "Strong";
        }

        return "Very Strong";
    }
}
