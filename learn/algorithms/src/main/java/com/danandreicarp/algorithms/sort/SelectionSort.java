package com.danandreicarp.algorithms.sort;

import java.util.List;

import com.danandreicarp.algorithms.util.AlgorithmsUtil;

public class SelectionSort extends Sorter<Integer> {

	private static List<Integer> list;

	public SelectionSort(final int size) {
		list = AlgorithmsUtil.generateLinkedList(size);
	}

	@Override
	public void sort(List<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			int min = i;

			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(j) < list.get(min)) {
					min = j;
				}
			}

			AlgorithmsUtil.swap(list, i, min);
		}
	}

	public static void main(final String[] args) {
		final SelectionSort ss = new SelectionSort(1000);

		ss.process(list);
	}

}
