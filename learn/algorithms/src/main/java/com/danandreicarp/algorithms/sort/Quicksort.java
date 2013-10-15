package com.danandreicarp.algorithms.sort;

import java.util.List;

import com.danandreicarp.algorithms.util.AlgorithmsUtil;

public class Quicksort extends Sorter<Integer> {

	private static List<Integer> list;
	
	public Quicksort(int size) {
		list = AlgorithmsUtil.generateLinkedList(size);
	}
	
	@Override
	public void sort(List<Integer> list) {
		sort(0, list.size() - 1);
	}
	
	private void sort(int left, int right) {
		if (left < right) {
			int p = partition(left, right);
			sort(left, p - 1);
			sort(p + 1, right);
		}
	}
	
	private int partition(int left, int right) {
		int p = selectPivot(left, right);
		AlgorithmsUtil.swap(list, p, right);
		int store = left;
		
		for (int i = left; i < right; i++) {
			if (list.get(i) <= list.get(right)) {
				AlgorithmsUtil.swap(list, i, store);
				++store;
			}
		}
		
		AlgorithmsUtil.swap(list, store, right);
		
		return store;
	}
	
	private int selectPivot(int left, int right) {
		int a = list.get(left);
		int b = list.get(right);
		int mid = (left + right) / 2;
		int c = list.get(mid);
		int result;
		
		if (left == right) {
			return left;
		}
		
		if (a < b) {
			if (b < c) {
				result = right;
			} else if (a < c) {
				result = mid;
			} else {
				result = left;
			}
		} else if (a < c) {
			result = left;
		} else {
			result = mid;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Quicksort qs = new Quicksort(1000);
		qs.process(list);
	}
	
}
