package helpers;

import java.util.Random;

public class RandomStringHelper {
	public static String generateSixDigitNumber() {
        Random random = new Random();
        int number = 100000 + random.nextInt(900000); // from 100000 to 999999
        return String.valueOf(number);
    }
	
	public static void main(String[] args) {
		System.out.println(generateSixDigitNumber());
	}
}
