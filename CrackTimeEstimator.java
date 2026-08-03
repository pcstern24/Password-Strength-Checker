/**
  * Calculates the time for cracking the password
  */
public class CrackTimeEstimator {

    private static final double OFFLINE_SPEED = 100_000_000_000.0;

    private static final double ONLINE_SPEED = 100.0;

    /**
      * Calculates the time it takes to crack password 
      * for offline attack
      *
      * @param entropy the calculated entropy for given password
      * @return the offline speed  
      */
    public static double offlineSeconds(double entropy) {
        
        return Math.pow(2, entropy) / OFFLINE_SPEED;
    }

    /**
      * Calculates the time it takes to crack password
      * for online attack
      *
      * @param entropy the calculated entropy for given password
      * @return the online speed
      */
    public static double onlineSeconds(double entropy) {
        
        return Math.pow(2, entropy) / ONLINE_SPEED;
    }
}
