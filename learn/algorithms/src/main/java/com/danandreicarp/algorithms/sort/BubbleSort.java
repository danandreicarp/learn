package com.danandreicarp.algorithms.sort;

import java.util.List;

import com.danandreicarp.algorithms.util.AlgorithmsUtil;

public class BubbleSort extends Sorter<Integer> {

	private static List<Integer> list;

	public BubbleSort(final int size) {
		list = AlgorithmsUtil.generateLinkedList(size);
	}

	@Override
	public void sort(List<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			for (int j = list.size() - 1; j > i; j--) {
				if (list.get(j) < list.get(j - 1)) {
					AlgorithmsUtil.swap(list, j, j - 1);
				}
			}
		}
	}

	public static void main(final String[] args) {
		final BubbleSort bs = new BubbleSort(10);

		bs.process(list);
	}
}
