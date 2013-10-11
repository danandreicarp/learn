package com.danandreicarp.algorithms.sort;

import java.util.List;

import com.danandreicarp.algorithms.util.AlgorithmsUtil;

public abstract class Sorter<T> {

	abstract List<T> getList();

	abstract void sort();

	void process() {
		final long start = AlgorithmsUtil.time("start");
		this.sort();
		final long end = AlgorithmsUtil.time("stop");
		System.out.println("time taken: " + (end - start));
		System.out.println(this.getList());
	}
}
