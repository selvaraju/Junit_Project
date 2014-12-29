package com.wmt;


public class StringReverse {

	
	public String reverse(String data) {
		
		if(data.length()==1){
			return data;
		}else{
			System.out.println(data.substring(1)+"Length:"+data.charAt(0));
			return reverse(data.substring(1)) +  data.charAt(0);
		}
		 		
	}
	
	public static void main (String arg[]) {
		
		StringReverse stringReverse = new StringReverse();
		System.out.println(stringReverse.reverse("Hail"));
	}
}
