/** 
  * Calculates the entropy of a password
  * Entropy is based on length and the size of 
  * possible character set 
  */
public class EntropyCalculator {

    /** Calculates password entropy using:
      * Entropy = Lenght * log2(Character set size)
      *
      * @param password The password entered by the user
      * @return Estimated entropy in bits 
      */
    public static double calculateEntropy(String password) {

        // Determine how many possible characters the password uses 
        int charset = calculateCharacterSet(password);

        // Apply the entropy stipend 
        return password.length() * (Math.log(charset) / Math.log(2));
    }

    /** Determines the size of the character set used by the password 
      * 
      * @param password Password entered by the user 
      * @return total character set size
      */
    public static int calculateCharacterSet(String password) {
        
        // Track which character types appear    
        boolean lower = false;
        boolean upper = false;
        boolean digits = false;
        boolean symbols = false;

        /** 
          * Examine each character in the password
          * Checks for lowercase, uppercase, digits, and special chars
          */
        for (char c : password.toCharArray()) {
        
            if (Character.isLowerCase(c)) {
                lower = true;
            } else if (Character.isUpperCase(c)) {
                upper = true;
            } else if (Character.isDigit(c)) {
                digits = true;
            } else {symbols = true;}
        }
        
        // Build the total character set size
        int size = 0;

        if (lower) {
            size += 26;
        } if (upper) {
            size += 26;
        } if (digits) {
            size += 10;
        } if (symbols) {
            size += 32;
        }

        return size;
    }
}
