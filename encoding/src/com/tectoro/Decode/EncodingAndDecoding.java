package com.tectoro.Decode;





import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class EncodingAndDecoding {

	public static void main(String[] args) throws UnsupportedEncodingException 
	{
		
		// Simple Encoder
		System.out.println("simple Encoding");
		String name="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";
		
		String en = Base64.getEncoder().encodeToString(name.getBytes());
		System.out.println(en);
		System.out.println();
		
		// Decoding
		String en1="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";
		System.out.println("simple decoding");
		byte[] dearray = Base64.getDecoder().decode(en1);
		String detext = new String(dearray, "UTF-8");
		System.out.println(detext);
		System.out.println();
		
		//URL Encoding
		System.out.println("URL Encoding");
		String url="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";
		String urlencode = Base64.getUrlEncoder().encodeToString(url.getBytes());
		System.out.println(urlencode);
		System.out.println();
		
    	//URL Decode
		byte[] urldecode = Base64.getUrlDecoder().decode(urlencode);
		String urlString = new String(urldecode);
		System.out.println(urlString);
		
		

	}

}