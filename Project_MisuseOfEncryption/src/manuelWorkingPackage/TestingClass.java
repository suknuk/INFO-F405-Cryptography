package manuelWorkingPackage;

//https://conv.darkbyte.ru/
//http://xor.pw/?


import java.util.Arrays;
import java.util.Base64;

public class TestingClass {
	
	public static String enc_a, enc_b, enc_c, enc_d, enc_e, enc_f, enc_g, enc_h, enc_i, enc_j;
	
	public static byte[] b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		initStrings();
		
		/*
		System.out.println(b1.length);
		System.out.println(b2.length);
		System.out.println(b3.length);
		System.out.println(b4.length);
		System.out.println(b5.length);
		System.out.println(b6.length);
		System.out.println(b7.length);
		*/
		
		//only iterate until the smallest one is at the end
		int max_length_possible = Math.min(b1.length, b2.length);
		max_length_possible = Math.min(max_length_possible, b3.length);
		max_length_possible = Math.min(max_length_possible, b4.length);
		//max_length_possible = Math.min(max_length_possible, b5.length);
		max_length_possible = Math.min(max_length_possible, b6.length);
		max_length_possible = Math.min(max_length_possible, b7.length);
		//max_length_possible = Math.min(max_length_possible, b8.length);
		//max_length_possible = Math.min(max_length_possible, b9.length);
		//max_length_possible = Math.min(max_length_possible, b10.length);
		
		//main comparing string
		byte[] compareWithMe = Arrays.copyOfRange(b6, 0, max_length_possible);
		
		// xoring the strings
		byte[] xored1 = xorMe(compareWithMe, Arrays.copyOfRange(b1, 0, max_length_possible));
		byte[] xored2 = xorMe(compareWithMe, Arrays.copyOfRange(b2, 0, max_length_possible));
		byte[] xored3 = xorMe(compareWithMe, Arrays.copyOfRange(b3, 0, max_length_possible));
		byte[] xored4 = xorMe(compareWithMe, Arrays.copyOfRange(b4, 0, max_length_possible));
		byte[] xored5 = xorMe(compareWithMe, Arrays.copyOfRange(b5, 0, max_length_possible));
		byte[] xored6 = xorMe(compareWithMe, Arrays.copyOfRange(b6, 0, max_length_possible));
		byte[] xored7 = xorMe(compareWithMe, Arrays.copyOfRange(b7, 0, max_length_possible));
		byte[] xored8 = xorMe(compareWithMe, Arrays.copyOfRange(b8, 0, max_length_possible));
		byte[] xored9 = xorMe(compareWithMe, Arrays.copyOfRange(b9, 0, max_length_possible));
		byte[] xored10 = xorMe(compareWithMe, Arrays.copyOfRange(b10, 0, max_length_possible));

		// guessing a phrase
		String guessingWord = "iples of e-voting technology. In our research, we investigate how von Neumann machines can be applied to the improve";
		byte[] the_byte = guessingWord.getBytes();  
		
		System.out.println(guessingWord.length());
		
		int position = 313;
		printComparison(position,the_byte,xored1);
		printComparison(position,the_byte,xored2);
		printComparison(position,the_byte,xored3);
		printComparison(position,the_byte,xored4);
		//printComparison(position,the_byte,xored5);
		System.out.println();
		printComparison(position,the_byte,xored6);
		printComparison(position,the_byte,xored7);
		//printComparison(position,the_byte,xored8);
		//printComparison(position,the_byte,xored9);
		//printComparison(position,the_byte,xored10);
		System.out.println();
		
		/*
		byte[] sub_xored = Arrays.copyOfRange(xored2, 122, 122 + guessingWord.length());
		byte[] aResult = xorMe(sub_xored, the_byte);
		System.out.println(new String(aResult));
		*/
		
		/*
		for (int i = 0; i < max_length_possible - guessingWord.length(); i++){
			System.out.print(i+ " ");
			printComparison(i,the_byte,xored1);
			printComparison(i,the_byte,xored2);
			printComparison(i,the_byte,xored3);
			printComparison(i,the_byte,xored4);
			printComparison(i,the_byte,xored5);
			printComparison(i,the_byte,xored6);
			printComparison(i,the_byte,xored7);
			printComparison(i,the_byte,xored8);
			printComparison(i,the_byte,xored9);
			printComparison(i,the_byte,xored10);
			System.out.println();
		}*/
	}

	public static void printComparison(int position, byte[] guessingWord , byte[] xored){
		byte[] sub_xored = Arrays.copyOfRange(xored, position, position + guessingWord.length);
		byte[] aResult = xorMe(sub_xored, guessingWord);
		System.out.println(new String(aResult) + " || ");
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
	
	public static void initStrings(){
		enc_a = "NiaS1Asaiafb8Jr8rvU7g2nqElh5ovkcMgqfyMd9m5OTxSA6Lrw1Ud+JF4wSEshI" +
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
		
		enc_b = "MiGbnQVUwLGa9obxrvE/h3O+Glotor9RCV+DytR8nZzciU05Nb9wBduBEskDSJIJ" +
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
		
		enc_c = "MiGVyUpTk/SC64frrvA7hW/sGkA87fxdAgucwMgw0rudlwg0MLVsBduBEskDepsF" +
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
		
		enc_d = "IzyAyBhTk6CIpJP+/PM/03T2EkB5oPpIERKc3dZnm5GdkQg2NLd6SdiPAIxCTp9I"
				+ "taWyl9QvmKKjxeuSdMh/M7VRNpLNUx6t6p5UYB/AYF+yvRN3qm1xOqn71Wjgbg28"
				+ "+92qvXNCxb/+Rrae23h7jzlLwzu+OwtOxYMWEnzAUX15OsGvIosTsWLg0TX1PHt6"
				+ "KMg98BbXhF4rpD/YvMmmAagp/OoJuvOXb0g7FF0ltRFX9XwNYIKibfT5kv9/P12W"
				+ "CspKOPGaUbh1oIiCvvbkZxmrHdTRglInXOOSp9H5tjqTl8YxYpCtKPQUfGQLs3ft"
				+ "/N69mLVHEI8zP7+1bVTh0opEFsjbWaDudO/yoZPSsuZAXrk6OsqiX3v1u+4OIvFB"
				+ "a+jxpDacMuCImdl6t91jKLYFDI1VSGkqTfBIxWm/FBt1Ruevj2vXZpvppQxEH/23"
				+ "oPz0S73DTp3OCAAWztWJ23hIoAuS9SZcUM65Gxm4uv4yNADlrXyhDLHu2z91/mas"
				+ "vOg/I5vM/7Hg9lXhFxgKQSfRMYCEkUHwa60BGIazc/0aONfLBZWxgm02Q2wgOSdH"
				+ "u1zwS7q3HsmujPjyCcngIQLi7bq09MAdJ4290ZSdp6eZ3TXhfRStqmXkHg==";
		
		enc_e = "KCaQ2AYag7ye55nw4PF6nnXtBxQuou1XXl+6wYZpk5HJyU0zOa41VsOJDcVQSJML"
				+ "var8jZoskqWq0r+fc9w+OqJDc8bVSgOm6oNSJUvNfQ+4uwR6uiRxMqnh3Tv1aAq+"
				+ "6o727mFfyLPkB72X1no/lShdhC64MUxJypURGSSVXnJpf4SnIIcPpniw3j/of2Fu"
				+ "JosO7xLGmR88oDLTvIC6SagS7PtBsvWXe1c7D1Z2pBhM5TRdaJyzcPT9gKxiOV/T"
				+ "RckfI+2WVbxxq82e++z4ahzlFpHXmlEwGuDep8b0+DjBkdQpdYaha+wVNW4F4Gbt"
				+ "9oi51LZODNx3M6ezblbh3ptDAITRE6DfbPq+v4bHtugeXqE8c82vDH3qsOMDJfMS"
				+ "Krz3rmCJLKmTndl3+Ml+LbcBHN1fQmgqVv4Ni2iuExhoVOOkhjHXQJPpvhZJFK/0"
				+ "uPqxRKrTAdj4FhwM0tzTkxs=";
		
		enc_f = "LCfUzw9ZhbqPpIv87+Qp3yDzBlcx7e1ZAxqS3cVn0prclk03Obx7BdOND8NXWZ5I"
				+ "oKSyitI+3bSjwPqXdd8yOL5SNonEAxuhqZZWbQraYB70uhNvuSJsN/q1m3XxeQqi"
				+ "6pW/onNE0vysQb2NlH06iigOxzW+JxhO0ZAKDjTARHt4Ose4PJ0Vt2SjxjP0MS5n"
				+ "YMgw9w/CmQwm4T3GoIqiFKZ92O8VsejUd0F6FEt2vxYF/3ldZp6iY7rg0/5pJU6S"
				+ "WMRXdOydVbs0tp2V7Pj+Yh6iWIfankonHODS5t/1+D7cnsE1dY6hfOsUfGQHtmLz"
				+ "/Ni13a9bVcAxeqW5b1C804pcB4SUXuPWd+HpoYLXuegBG6AmIIXqCHbxuulKLvlQ"
				+ "JPjwpGXMNOGb2M5w+ct4M7UDAd1JX3NkQf8Yx2m4QxthDevsniqDRpuu6gpFGef5"
				+ "u/+7TaeOAbnQRAYQ1NWP1mJe4QmE73oTVM61UgCr/+4pMwTht23zBar82yZv4maH"
				+ "v/s9MIHR/7PvtV7nFxsQEynZMcfGgAnwb/0FEJC/c/0Ues/GE5W7jnNkTn9lOSNN"
				+ "qlzqT/ORDsL6kOjzU4DsKR+lvtM=";
		
		enc_g = "KCiaxEpTjrKU9p/4+v81nSDqG1E2v/ZPBAzT2Ml6npadhAonObw1Ud+JDYADVJsM"
				+ "9KLm3tQ0ifCk0/qVOskwL/BBd4vHDgOmr5hIJR/BZl+xpB9ouihzM+Xh3HLxfEPw"
				+ "6pW/7mVezKXgRqyT23t7kysO0jW+dCJZ0Z4fBT7AXXJ+cs25N51BqHin2i67MWt+"
				+ "Y5pc/gPEk149oj3fvZusA6Z93PEIp+6dYEM7FUw5sxhE5WBEasy3bLC0g+l+O16H"
				+ "S8VTMaWVU7V5vJqf7PL5KwW2HdTCilssBeDessewuzLdhNUza8P1euIYMmEArGK/"
				+ "8Me23qhIAN02LqC/b0i/n6lfEJzcWvKROfr2pJSTs+QLFrpyIMyvEj7ovPMcLuZB"
				+ "Lrz7tGLMJuySlI12+Y19KLYDRYpQWXIqTeMai2mzExFkWe+1gSqZXNvpiRJFG/37"
				+ "rb/0Qr/TSdDKBQsJw4bd0n9foBSJ6z9dRov0Vwmy6PQpMg7z42u8Aan+nzUg5Sjp"
				+ "tfw0NJ2fq7GusEPiHxcPX2rMN4KEgUzhc+IQFJC1J6kUPJvcE9H/gW93QmIgIDRG"
				+ "uw+rCdk=";
		
		enc_h = "tdclP7qFMG8rNCMeXxV6IoJOxuToHSocoMsjEXa+I3JtW73pcNPFhGdWqC3zhyvr"
				+ "BH1DfZqKfwBzZi4rr4+P4gCYx2Rynady8P3q4rojJa9pBMM7HvbO6Vk/a65Eu75c"
				+ "vi1oHqPnFQEABwhCZKKLTZ2edOgA7LyHiPmu/4BV4KHNonVRg21BFaPgYuxL5966"
				+ "12OtE0JiSK/TENx6fzl7tzCNIrJrBDglhQTL2+jj8KCfRqr8iT1e01dETly8dvpw"
				+ "+hbv7FVIDd7Efj1ATxlataBxqEFyYh6SzkNAFhxBWYwxISeMsjM62Duh5y5oEJVP"
				+ "IXhtaHsPpC2H7xlh0LSxbmAKslVkiqBtrl4uHVZiXV3Yr01oWXlorpW4CTy6+0SL"
				+ "myhJdMdkkQXeKBHPIn2skFdGtULpk8q48xe5Jdx/svcrJ15RyJR1/0AZda6Vqw9G"
				+ "WLMFqA8rASAMtNe0JiVDYpPrOKpmVtofKXsI69v9Si6N5LIAEoYD1OVbQ3DRDZZ2"
				+ "Cj6B0z4z/w41Bohez67b4stp08WK7yNBvF3SqUAK0VnOigB+xpUCWNOj8bjQ4ZaX"
				+ "D/Co+WwX6XBiMgtRlcWFnPyrT18NIX/p2xgMDSAFGk/OIOivyeAaY5pExG8ezFc3"
				+ "NUBlfJ/NG9NvqKAIvQFFqE2qhmFM+lVKxzeLx1+OGzlNeZZ3LRu9Hvpl/5hAIpLR"
				+ "7yS0P2hqP0uzJvRAoBisDcT7TFtJ9hWbjN6jvlkTiGr8aQftz5lBlXU=";
		
		enc_i = "NiiY3B9JwLuVpIb45/I/h3T/U182oPJJHhaYwM9rk9LRJskmMhqxStuEHN9QXdoe"
				+ "tbjmi8kvnLqnmL+v2QsynnQGYo/HRxLupZkaMA7acAygtVZ2oSl7Lufn1TvgZgqk"
				+ "8YmvvGBWwL6iB4yPxmM6kCFH1y+lJ0xI0YcVAjqBRDNxb8uzM84VsGO20zb3Nn19"
				+ "c5wI90LTmhk9szfeooyjBqZ91udBufWaZ0U7FV06vBFM5X1MKY26ZbvmmvhhM0GS"
				+ "BodLIeudRKBhsIPQ8feqeBGpGYHQwx4REP+fs9uwuTPHkcZ8aoboZO8UfHQDsGa/"
				+ "4MGxyrXs0WzzeqWlbk/l3oJfCZvRU+zUauf/7ZPau/kDFK98WQ==";
		
		enc_j = "JiiB2gJOwL2VpJO54vc0l3PyGlA8x9BMFRHTws9hltLbih91PflxTNGOHN5GUo5I"
				+ "oqL3ibAImLXm3vCMOuZ/MbVHYIOCVB66otdfNg7afF+kvRN4q21xOqn31G6eQQCn"
				+ "vpSu7npYzrv/B7mJlGEzkzhJzHqkPAlFg4EbSziFQnY9bsv3IZoAvBuZ3S+7MGBk"
				+ "f8gb8xaSmRA34S3CoJ3lR+wyuecOoLqZZ1doRkE5pQIF9XxMZ4+zIqD70+5gOVz5"
				+ "Zs5UMaWSAaR4uJ6E9/qqaRGicr2DhVsjA7OHqd2wuzzfnIcxfsPvae4UVlQNp2Lr"
				+ "+82qmLZKVdwjO6e0C3/j3phDDI+UUuWdcOCy7Ybduq0VEbtyOMCpFHf2vqEHLrRd"
				+ "PuiT";
		
		b1 = Base64.getDecoder().decode(enc_a);
		b2 = Base64.getDecoder().decode(enc_b);
		b3 = Base64.getDecoder().decode(enc_c);
		b4 = Base64.getDecoder().decode(enc_d);
		b5 = Base64.getDecoder().decode(enc_e);
		b6 = Base64.getDecoder().decode(enc_f);
		b7 = Base64.getDecoder().decode(enc_g);
		b8 = Base64.getDecoder().decode(enc_h);
		b9 = Base64.getDecoder().decode(enc_i);
		b10 = Base64.getDecoder().decode(enc_j);

	}

}