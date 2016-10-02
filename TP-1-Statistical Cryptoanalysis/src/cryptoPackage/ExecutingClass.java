package cryptoPackage;

public class ExecutingClass {

	public static void main(String[] args) {
		//Ex1();
		//Ex2();
		
		Ex3();
		
	}

	public static void Ex1() {
		String encrypted = "Kzgxbwozixpg qa ijwcb kwuucvqkibqwv qv bpm xzmamvkm wn iv ildmzaizg.";
		String decrypted = CaesarCypher.decrypt(encrypted, 8);
		System.out.println(decrypted);
	}

	public static void Ex2() {
		String encrypted1 = "Fbzr crbcyr jrne Fhcrezna cnwnznf. Fhcrezna jrnef Puhpx Abeevf cnwnznf.";
		String encrypted2 = "’Yvccf, nficu!’ - zj fev fw kyv wzijk kyzexj gvfgcv kipkf gizek nyve kyvp "
				+ "cvrie r evn gifxirddzex crexlrxv.";
		
		// brute-forcing text 1
		for (int i = 0; i < 26; i++){
			System.out.println(i + " " + CaesarCypher.decrypt(encrypted1, i));
		}
		
		System.out.println();
		
		// brute-forcing text 1
		for (int i = 0; i < 26; i++){
			System.out.println(i + " " + CaesarCypher.decrypt(encrypted2, i));
		}
		
		// text 1 13 shifts
		// text 2 17 shifts

	}

	public static void Ex3() {
		CaesarCypher.frequencyAnalysis("Kzgxbwozixpg qa ijwcb kwuucvqkibqwv qv bpm xzmamvkm wn iv ildmzaizg.");
		CaesarCypher.frequencyAnalysis("Fbzr crbcyr jrne Fhcrezna cnwnznf. Fhcrezna jrnef Puhpx Abeevf cnwnznf.");
		CaesarCypher.frequencyAnalysis("’Yvccf, nficu!’ - zj fev fw kyv wzijk kyzexj gvfgcv kipkf gizek nyve kyvp "
				+ "cvrie r evn gifxirddzex crexlrxv.");
	}
	
}
