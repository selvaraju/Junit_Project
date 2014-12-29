package com.wmt;

import org.junit.Assert;
import org.junit.Test;

public class MergeArrayTest {

	
	@Test
	public void arryaEqual(){
		
		int left [] = {1,4,8,10}; 
		int right [] = {2,5,7,9};
		 
		int expected[] = {1,2,4,5,7,8,9,10};
		int output[] = new int[(left.length + right.length)];
		MergeArray.merge(output,left,right);
		Assert.assertArrayEquals("Array Equals", expected,output);
	}
	
	@Test
	public void arryaEmptyEqual(){
		
		int left [] = {}; 
		int right [] = {};
		 
		int expected[] = {};
		int output[] = new int[(left.length + right.length)];
		MergeArray.merge(output,left,right);
		Assert.assertArrayEquals("Array Equals", expected,output);
	}
}
