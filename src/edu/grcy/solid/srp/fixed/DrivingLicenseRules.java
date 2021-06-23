package edu.grcy.solid.srp.fixed;

public class DrivingLicenseRules {
    /**
     * MAGIC NUMBER to zaszycie w kodzie numerów oznaczających jakąś logikę
     * np. próg pełnoletniości
     *
     * Unikamy tego np powołując pola finalne jak poniżej
     */

    private static final int DRIVING_LICENSE_REQUIRED_AGE = 18;

    public static boolean canGetDrivingLicense(Person person) {
//        return person.getAge() >= 21; //MAGIC NUMBER
        return person.getAge() >= DRIVING_LICENSE_REQUIRED_AGE;

    }
}
