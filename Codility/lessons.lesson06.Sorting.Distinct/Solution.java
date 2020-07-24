package com.algorithm;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
	public int solution(int[] A){
		  // write your code in Java SE 8
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < A.length ; i++){
           set.add(A[i]);
        }
        return set.size();
	}
}


