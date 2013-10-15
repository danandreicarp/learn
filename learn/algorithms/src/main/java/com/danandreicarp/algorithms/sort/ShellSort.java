package com.danandreicarp.algorithms.sort;

import java.util.List;

import com.danandreicarp.algorithms.util.AlgorithmsUtil;

public class ShellSort extends Sorter<Integer> {

	private static List<Integer> list;

	public ShellSort(final int size) {
		list = AlgorithmsUtil.generateLinkedList(size);
	}

	@Override
	public void sort(List<Integer> list) {
		int gap = Double.valueOf(Math.floor(list.size() / 2)).intValue();

		while (gap > 0) {
			for (int i = gap; i < list.size(); i++) {
				final Integer temp = list.get(i);
				int j = i;

				while (j > gap - 1 && list.get(j - gap) > temp) {
					list.set(j, list.get(j - gap));
					j = j - gap;
				}

				list.set(j, temp);
			}
			gap = Double.valueOf(Math.floor(gap / 2)).intValue();
		}
	}

	public static void main(final String[] args) {
		final ShellSort ss = new ShellSort(5);
		ss.process(list);
	}

}
