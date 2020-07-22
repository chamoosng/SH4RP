package com.algorithm;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
	public int solution(int A, int B, int K){
		if(A%K==0)
            return B/K - A/K +1;
        return B/K - A/K;
		
	}
}


