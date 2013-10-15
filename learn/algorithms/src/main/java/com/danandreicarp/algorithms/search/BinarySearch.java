package com.danandreicarp.algorithms.search;

import java.util.List;

import com.danandreicarp.algorithms.sort.InsertionSort;
import com.danandreicarp.algorithms.util.AlgorithmsUtil;

public class BinarySearch {
	
	private static List<Integer> list;
	
	public BinarySearch(int size) {
		list = AlgorithmsUtil.generateLinkedList(size);
	}
	
	public int search(List<Integer> list, Integer element) {
		int lo = 0;
		int hi = list.size() - 1;
		
		while (lo < hi) {
			int i = (lo + hi)/2;
			
			if (element.equals(list.get(i))) {
				return i;
			}
			
			if (element.compareTo(list.get(i)) < 0) {
				hi = i - 1;
			} else {
				lo = i + 1;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		while (true) {
			BinarySearch bs = new BinarySearch(100);
			InsertionSort is = new InsertionSort();
			is.sort(list);
			
			int result = bs.search(list, 13);
			
			if (result != -1) {
				System.out.println(list);
				System.out.println(result);
				break;
			}
		}
		
	}
}
