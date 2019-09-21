package com.oyorooms.sahin;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindElementSortedArray {

	public static int[] makeRandomSortedArrayWithDistinctElements(int size) {
		int[] randomArray = new int[size];
		int randomValue;
		Set<Integer> uniqueNumSet = new HashSet<Integer>();
		for(int i=0; i<size; i++) {
			randomValue = (int) (Math.random() * size * 5);
			if(!uniqueNumSet.contains(randomValue)) {
				uniqueNumSet.add(randomValue);
				randomArray[i] = randomValue;
			}
		}
		Arrays.sort(randomArray);
		return randomArray;
	}
	
	public static int findIndexHavingSameValue(int[] sortedArray) {
		int left, right, mid;
		left = 0; right = sortedArray.length-1; mid = (left + right) / 2;
		
		while(left <= right) {
			if(sortedArray[mid] == mid) {
				return mid;
			} else if(sortedArray[mid] > mid) {
				right = mid - 1;
				mid = (left + right) / 2;
			} else {
				left = mid + 1;
				mid = (left + right) / 2;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		int[] randomSortedArray = makeRandomSortedArrayWithDistinctElements(6);
		System.out.println(Arrays.toString(randomSortedArray));
		System.out.println(findIndexHavingSameValue(randomSortedArray));
		
		randomSortedArray = new int[]{-10, -5, 0, 3, 7};
		System.out.println(findIndexHavingSameValue(randomSortedArray));
		
		randomSortedArray = new int[]{0, 2, 5, 8, 17};
		System.out.println(findIndexHavingSameValue(randomSortedArray));

		randomSortedArray = new int[]{-10, -5, 3, 4, 7, 9};
		System.out.println(findIndexHavingSameValue(randomSortedArray));
	}
}
