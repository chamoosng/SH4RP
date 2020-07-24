package com.algorithm;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
	public int solution(int[] A){
		  // write your code in Java SE 8
		 Arrays.sort(A);
	        
	        int i = A.length - 1;
	        
	        int result = A[i] * A[i-1]* A[i-2];
	        
	        return ((A[0] * A[1] * A[i])>result)?(A[0] * A[1] * A[i]):result;
	}
}


