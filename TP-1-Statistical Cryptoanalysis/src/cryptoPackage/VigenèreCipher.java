package cryptoPackage;

public class VigenèreCipher {
	
	// encrypt a text with a key
	public static String encrypt(String plain, String key){
		String encrypted = "";
		
		int keyPosition = 0;
		
		for (int i = 0; i < plain.length(); i++){
			char tmpChar = plain.charAt(i);
			
			int decryptWith = key.charAt(keyPosition) - 'a';
			
			encrypted += CaesarCipher.shiftChar(tmpChar, decryptWith);
			keyPosition = (keyPosition + 1) % key.length();
		}
		return encrypted;
	}
	
	// decrypt a secret with a key
	public static String decrypt(String secret, String key){
		String decrypted = "";
		
		int keyPosition = 0;
		
		for (int i = 0; i < secret.length(); i++){
			char tmpChar = secret.charAt(i);
			
			//minus, as we wqnt to reverse the positive shift
			int decryptWith = -(key.charAt(keyPosition) - 'a');
			
			decrypted += CaesarCipher.shiftChar(tmpChar, decryptWith);
			keyPosition = (keyPosition + 1) % key.length();
		}
		
		return decrypted;
	}
}
