package cryptoPackage;

public class CaesarCipher {

	// ascii codes of alphabet
	static int a = 'a';
	static int z = 'z';
	static int A = 'A';
	static int Z = 'Z';

	public static String encrypt(String plain, int shift) {

		String encrypted = "";
		for (int i = 0; i < plain.length(); i++) {
			char tmp = plain.charAt(i);
			encrypted += shiftChar(tmp, shift);
		}

		return encrypted;
	}

	public static String decrypt(String decrypted, int shift) {
		return encrypt(decrypted, -shift);
	}

	// Class to shift a char with a given shift
	public static char shiftChar(char c, int shift) {

		int tmp = c;

		// char is lower case letter
		if (tmp >= a && tmp <= z) {
			tmp += shift;
			// shift to high -> begin shifting from a
			if (tmp > z) {
				tmp = a + (tmp - z) - 1;
			}
			// shift to low -> begin shifting from z
			else if (tmp < a) {
				tmp = z + (tmp - a) + 1;
			}
		}
		// char is upper case
		else if (tmp >= A && tmp <= Z) {
			tmp += shift;
			// shift to high -> begin shifting from A
			if (tmp > Z) {
				tmp = A + (tmp - Z) - 1;
			}
			// shift to low -> begin shifting from Z
			else if (tmp < A) {
				tmp = Z + (tmp - A) + 1;
			}
		}

		return (char) tmp;
	}

	// doing a frequency analysis of a string
	public static void frequencyAnalysis(String encrypted) {
		
		System.out.println("Using frequency analysis in order to try to decrypt the following string: " + encrypted);
		
		// array of letter frequency of the English alphabet from a - z
		double[] englishFrequency = { 8.17, 1.49, 2.78, 4.25, 12.70, 2.23, 2.02, 6.09, 6.97, 0.15, 0.77, 4.03, 2.41,
				6.75, 7.51, 1.93, 0.09, 5.99, 6.33, 9.06, 2.76, 0.98, 2.36, 0.15, 1.97, 0.07 };
		// letter frequency of encrypted string
		double[] encryptedFrequency = new double[26];

		String encryptedLower = encrypted.toLowerCase();
		// count of letters in string
		int letterCount = 0;

		// obtain letter frequency of encrypted string
		for (int i = 0; i < encryptedLower.length(); i++) {
			char tmp = encryptedLower.charAt(i);

			// put char into form a-z = 0-25
			if (tmp >= a && tmp <= z) {
				tmp -= a;
				encryptedFrequency[tmp]++;
				letterCount++;
			}
			// char is not a letter -> next iteration
			else {
				continue;
			}
		}

		// what is the percentage of occurrence of one letter?
		double percentageOfOneChar = 100.0 / letterCount;

		// now transform the count of letters into a percentage of occurrence
		for (int i = 0; i < 26; i++) {
			encryptedFrequency[i] *= percentageOfOneChar;
		}

		boolean lowestDifferenceShiftInitiated = false;
		int lowestDifferenceShift = 0;
		double lowestDifference = 0.0;
		
		// now iterate all 26 shifts to calculate the difference in frequency
		for (int shift = 0; shift < 26; shift++) {
			double difference = 0.0;
			// iterate every letter of the alphabet
			for (int i = 0; i < 26; i++) {
				double englishLetter = englishFrequency[i];
				double encryptedLetter = encryptedFrequency[(i+shift) % 26];
				difference += Math.abs(englishLetter - encryptedLetter);
			}
			
			// save lowest difference/shift
			if (lowestDifferenceShiftInitiated == false){
				lowestDifferenceShiftInitiated = true;
				lowestDifferenceShift = shift;
				lowestDifference = difference;
			} 
			// found new lowest difference
			else if (difference < lowestDifference){
				System.out.println("found new lowest difference from: " + lowestDifference + ", to : " + difference);
				lowestDifference = difference;
				lowestDifferenceShift = shift;
			}
			
			System.out.println("Shift of :" + shift + " gives a total difference of :" + difference);
		}
		
		System.out.println();
		System.out.println("Shift of :" + lowestDifferenceShift + " yields in the lowest difference");
		System.out.println("Decrypted text with that shift : " + decrypt(encrypted, lowestDifferenceShift ));
		
	}
}
