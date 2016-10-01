package cryptoPackage;

public class ExecutingClass {

	public static void main(String[] args) {
		System.out.println("hello");

		char a = 'A';
		System.out.println(a + " " + CaesarCypher.shiftChar(a, 1));
				
		
	}

}
