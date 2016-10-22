package manuelWorkingPackage;

//https://conv.darkbyte.ru/
//http://xor.pw/?


import java.util.Arrays;
import java.util.Base64;

public class TestingClass {

	public static String enc1 = "NiaS1Asaiafb8Jr8rvU7g2nqElh5ovkcMgqfyMd9m5OTxSA6Lrw1Ud+JF4wSEshI" +
			"uaL+ktM0k/C20/CLdsp/MblQc8bWSxK8r/1VLkvcbRr0oBNpvCRqM/v3m3TyL1vp" +
			"rt2pv2NW07WsTLGW23g+iChc13TwAwRVx5teBjGLVWA9bsy+Ic4CrGW5kjX1Oi5n" +
			"YMgI/geSmh8gpjvZu8mgCagp8exBt/WBYFBpHxZchBhAtndEfZX2a6e0gPllIl6S" +
			"XsJbdOydAaB8vM2n++r+Kx+jWLbWgVkjA/qf6IjDtzvakYc1dMPyffEDM3UMpGL7" +
			"s8qhmKxAAMEjO6C+chWb7IBMC4mUVvOdcOC+uY/W/tg4PeVgc92jEnu4o+4ELro4" +
			"GPP/qHfMKOiN2MB++dQxNbcTF45NDXt+VuQJyHiiDBp0Aa6ghSqZSNW9ohtNWu7l" +
			"sZmaS6rJTp7fCEkk1YaY3nNX+Vu09iNSUc65GyC87vQyNALs41iyAaTonnBv6maK" +
			"r+IkJJ3a8/7dt1/gDV4wXCzRPsfnjVzjfOVFWaavMv0OP5vBEJWBgmp4VSlTOyBK" +
			"v1ClfaCnGcm9kezlVoLgbB/j8aq4sc8Hb42f3oDUv6mC0BbgahLk2R+2bfe7Jafr" +
			"fCvHtG8LpAXbAzLE8baQCpEbVZC3suyZc5ciFvocqv747TOXmNH47nI=";
	
	public static String enc2 = "MiGbnQVUwLGa9obxrvE/h3O+Glotor9RCV+DytR8nZzciU05Nb9wBduBEskDSJIJ" +
			"oPSyv9Q/3aeuz7+aaMp/JL9TNoLNShmp6p5Of2Hhdl+nuxt+oSN7fO/hyXj9YQjw" +
			"55Kv8TZ5zu+sbr7a2nov0G1azD++dBtUxYdeHziFEHt4dsj3O51BsmOv3D27KGd8" +
			"bsgF+ReN/Do94SfFusmiCecquf0Jte7UfEF6AlE4t1BK4nxIe8ymZ7vkn+krJQuf" +
			"T9NLMfeAAb1n+YOf6rn8bgK8WJrKjltiEP2a5sb/rH3Dn8s1c4a+AspRPW1Crmjr" +
			"s8y30a9IVds/O73walX40YsKDY6US+jUd+nt7MfgtuwBG+49PYmzEGu5+dICKvlX" +
			"Z7zqqXeBJaXei8V++sgwS5UfRZBcXmlrRfMbi3ikQz9mX+LhiTeSD4a9uBdDDuPu" +
			"9PC7RLjJRZXQEAAEytTd/H9X+VuK4noTaMrnV0689Pl9Lgvl40aALOXomj4g/iOo" +
			"vq4kOYbM/7uju1fnFQ1NHUDvN4bQxUjjeq0QFoD7J/sCM9XJVsG9w2d5HilBJiMD" +
			"pxPwCae0Esm0hK31SsntPgnq9fmw6I4KedSsy5/OsrualT2wEjWl/2ugcba9au/m" +
			"eiHQqGNYuBzRU1DY6fGDEZ8ST5CutfLUHPU+Cvscuen6rDWbjo+XjhTcLC3UBA==";
	
	public static String enc3 = "MiGVyUpTk/SC64frrvA7hW/sGkA87fxdAgucwMgw0rudlwg0MLVsBduBEskDepsF" +
			"vafr3v0uhPHM/+vcaY8sMvBAY4jMWlbuj4FfLkvcbRChsx47vSJzOf3n1n7nLwak" +
			"vpSp7ncXzbn4U7SflHcyiG1d0C+gPQgQrocWDinAX3Vpf8r3OIEKoDGh0DXuKy5+" +
			"Y5oFtgHdmAogoCjPvZqgBuR97eYRvfmHLkhyDV12oB9J/2BEap/2Y7rw0/5pOkKU" +
			"Q8hReo+nSbFt+YWR6PyqeB/lFZXNlB4mGPWYo9r1timTg9Mla4byKOwXfGUSqXTw" +
			"982rmeF8GsIyeqiybk7ln5xJC8XSVqDObfv4q8ebsuQHG+4mOsSvUmrquPcPJ70e" +
			"QfPtqXOeYOiMnY1v9t9+JbEDFt0RQXNhR7YJi3yqERtjVK6ujmWkW5S76ilBCPy+" +
			"+rOAQrvZAZXIAQdFzpSL1jFaoB+I4HZHS8rhGw289L0uKgbhqCTzBaz42z5h4SPp" +
			"s/1wE53WvrCg3HfgHV4XWy/KOsfNlgnwca0MD5y3c+saOMKOJcG3lGpzDylPIC5G" +
			"rFzmQbK0CsOuhv/yBYj9KUzo/7Wx9MpJW8io2oKR64SBmSOjOCWioSK3NLahLqfK" +
			"fC2b0A==";
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println(enc3.length());
		
		String c1 = enc1;
		String c2 = enc2;
		String c3 = enc3;
		
		byte[] b1 = Base64.getDecoder().decode(c1);
		byte[] b2 = Base64.getDecoder().decode(c3);
		//only iterate until the smallest one is at the end
		int max_length_possible = Math.min(b1.length, b2.length);
		
		// xoring the strings
		byte[] xored = xorMe(Arrays.copyOfRange(b1, 0, max_length_possible), 
				Arrays.copyOfRange(b2, 0, max_length_possible));

		// guessing a phrase
		String guessingWord = " National ";
		byte[] the_byte = guessingWord.getBytes();  
		
		byte[] sub_xored = Arrays.copyOfRange(xored, 363, 363 + guessingWord.length());
		byte[] aResult = xorMe(sub_xored, the_byte);
		System.out.println(new String(aResult));
		
		/*
		for (int i = 0; i < xored.length - guessingWord.length(); i++){
			// copy part the xored bytes of length of the guessed word
			byte[] sub_xored = Arrays.copyOfRange(xored, i, i+guessingWord.length());
			// xoring with guessed word
			byte[] aResult = xorMe(sub_xored, the_byte);
			//System.out.println(Arrays.toString(aResult));
			System.out.println(i + " " + new String(aResult));
		}*/
		
		// words searched with: ' the ', ' and '
		// 122 ' makes y' -> ' the hea'
		// 145 ' you? ' -> ' the F'
		// 363 'l and the ' -> ' National '
	}

	// xor of two byte arrays with the same length
	public static byte[] xorMe(byte[] b1, byte[] b2) {
		byte[] xored = new byte[b1.length];

		for (int i = 0; i < b1.length; i++) {
			xored[i] = (byte) (b1[i] ^ b2[i]);
		}

		return xored;
	}
	
	public static void XoringExample(){
		String c1 = "MZ6640ufx0bwjXKF";
		String c2 = "LZOzr1TN307wgHuF";

		byte[] b1 = Base64.getDecoder().decode(c1);
		byte[] b2 = Base64.getDecoder().decode(c2);

		byte[] xored = xorMe(b1, b2);

		System.out.println(Arrays.toString(b1));
		System.out.println(Arrays.toString(b2));
		System.out.println(Arrays.toString(xored));

		//

		// guessing a phrase
		String the = "the";
		byte[] the_byte = the.getBytes();  
		System.out.println(Arrays.toString(the_byte));

		// copy the xored bytes
		byte[] sub_xored = Arrays.copyOfRange(xored, 0, 3);
		System.out.println(Arrays.toString(xored));

		// xor of a the result and a guessed phrase. If 'the' was in this exact
		// position, we now should see the other message
		byte[] aResult = xorMe(sub_xored, the_byte);
		System.out.println(Arrays.toString(aResult));
		System.out.println(new String(aResult));
	}

}