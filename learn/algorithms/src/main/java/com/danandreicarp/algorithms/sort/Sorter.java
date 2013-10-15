package com.danandreicarp.algorithms.sort;

import java.util.List;

import com.danandreicarp.algorithms.util.AlgorithmsUtil;

public abstract class Sorter<T extends Comparable<T>> {

	public abstract void sort(List<T> list);

	public void process(List<T> list) {
		final long start = AlgorithmsUtil.time("start");
		sort(list);
		final long end = AlgorithmsUtil.time("stop");
		System.out.println("time taken: " + (end - start));
		System.out.println("sorted: " + isSorted(list));
		System.out.println(list);
	}
	
	private boolean isSorted(List<T> list) {
		
		for (int i = 1; i < list.size(); i++) {
			if (list.get(i - 1).compareTo(list.get(i)) > 0) {
				return false;
			}
		}
		
		return true;
	}
}
