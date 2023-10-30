package com.Pratics;

public class PraticsSecond {
	static String print() {
		try {
			return "rajesh";
		} catch (Exception e) {
			// TODO: handle exception
			return "Gajraj";
		} finally {
			return "chala wale";
		}
	}

	public static void main(String[] args) {
		/*
		 String str ="rajesh gajraj";
		str=str.replaceAll("j","k");
		System.out.println(str);
		System.out.println(str.toUpperCase());
		System.out.println(str.substring(2,5));
		System.out.println(str.subSequence(2,5));
		System.out.println(str.lastIndexOf('k'));
		String str2=str.intern();
		System.out.println(str2);
		System.out.println(str.matches("rakesh gakrak"));
		System.out.println(str.regionMatches(5, str2, 2, 5));
		
		System.out.println(str.split("gajr",2));
		int a =2;
		byte b=(byte)a;
		System.out.println(b);
		*/
		/*
		 int arr[][] = new int[3][];
         arr[0] = new int[1];
         arr[1] = new int[2];
         arr[2] = new int[3];              
	    int sum ;
	    sum=0;
	    for (int i = 0; i < 3; ++i)
	        for (int j = 0; j < i + 1; ++j)
                 arr[i][j] = j + 1;
                 */
		
		System.out.println(print());
	    
	}

}
