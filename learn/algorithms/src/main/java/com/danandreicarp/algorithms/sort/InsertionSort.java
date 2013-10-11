package com.danandreicarp.algorithms.sort;

import java.util.List;

import com.danandreicarp.algorithms.util.AlgorithmsUtil;

public class InsertionSort extends Sorter<Integer> {

	private static List<Integer> list;

	public InsertionSort(final int size) {
		list = AlgorithmsUtil.generateLinkedList(size);
	}

	@Override
	List<Integer> getList() {
		return list;
	}

	@Override
	public void sort() {
		for (int i = 1; i < list.size(); i++) {
			final Integer temp = list.get(i);
			int j = i;

			while (j > 0 && list.get(j - 1) > temp) {
				list.set(j, list.get(j - 1));
				j = j - 1;
			}

			list.set(j, temp);
		}
	}

	public static void main(final String[] args) {
		final InsertionSort is = new InsertionSort(1000);
		is.process();
	}

}
