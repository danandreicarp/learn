package com.danandreicarp.algorithms.sort;

import java.util.List;

import com.danandreicarp.algorithms.util.AlgorithmsUtil;

public class InsertionSort extends Sorter<Integer> {

	private static List<Integer> list;

	public InsertionSort() {
		
	}
	
	public InsertionSort(final int size) {
		list = AlgorithmsUtil.generateLinkedList(size);
	}

	@Override
	public void sort(List<Integer> list) {
		for (int i = 1; i < list.size(); i++) {
			insert(list, i, list.get(i));
		}
	}


	private static void insert(List<Integer> list, int pos, Integer value) {
		int i = pos - 1;

		while (i >= 0 && list.get(i) > value) {
			list.set(i + 1, list.get(i));
			i = i - 1;
		}

		list.set(i + 1, value);
	}
	
	public static void main(final String[] args) {
		final InsertionSort is = new InsertionSort(1000);
		is.process(list);
	}
	
}
