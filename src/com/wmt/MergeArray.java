package com.wmt;

public class MergeArray {

	
	public static void merge(int output[],int left[],int right[]){
		
		int i1 = 0;
		int i2 = 0;
		
		for(int i=0;i<output.length;i++){
			
			 if(i2>=right.length || ( i1 < left.length && left[i1] < right[i2])){
				 output[i] = left[i1];
				 i1++;
			 }else{
				 output[i] = right[i2];
				 i2++;
			 }
			
		}
		
	
	
	
	}
	
	
	public static void main(String arg[]) {
		
		int left [] = {1,4,8,10}; 
		int right [] = {2,5,7,9};
		 
		
		int output[] = new int[(left.length + right.length)];
		merge(output,left,right);
		
		for(int i=0;i<output.length;i++){
			System.out.println(output[i]);
		}	
		
		 
		System.out.println("\n");
		for(int i=0;i<output.length;i++){
			System.out.print(output[i]+"\t");
		}
		
	}
	
}
