package cryptoPackage;

public class CaesarCypher {
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

		int a = 'a';
		int z = 'z';
		int A = 'A';
		int Z = 'Z';

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
}
