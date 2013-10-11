package com.danandreicarp.algorithms.sort;

import java.util.List;

import com.danandreicarp.algorithms.util.AlgorithmsUtil;

public class BubbleSort extends Sorter<Integer> {

	private static List<Integer> list;

	public BubbleSort(final int size) {
		list = AlgorithmsUtil.generateLinkedList(size);
	}

	@Override
	List<Integer> getList() {
		return list;
	}

	@Override
	void sort() {
		for (int i = 0; i < list.size(); i++) {
			for (int j = list.size() - 1; j > i + 1; j--) {
				if (list.get(j) < list.get(j - 1)) {
					AlgorithmsUtil.swap(list, j, j - 1);
				}
			}
		}
	}

	public static void main(final String[] args) {
		final BubbleSort bs = new BubbleSort(1000);

		bs.process();
	}

}
