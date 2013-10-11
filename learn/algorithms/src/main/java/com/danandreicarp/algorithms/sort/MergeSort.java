package com.danandreicarp.algorithms.sort;

import java.util.LinkedList;
import java.util.List;

import com.danandreicarp.algorithms.util.AlgorithmsUtil;

public class MergeSort extends Sorter<Integer> {

	private static List<Integer> list;
	private static List<Integer> aux;

	public MergeSort(final int size) {
		list = AlgorithmsUtil.generateLinkedList(size);
	}

	@Override
	List<Integer> getList() {
		return list;
	}

	@Override
	void sort() {
		aux = new LinkedList<Integer>();

		sort(0, list.size() - 1);
	}

	void sort(final int lo, final int hi) {
		if (hi <= lo) {
			return;
		}

		final int mid = (lo + hi) / 2;

		sort(lo, mid);
		sort(mid + 1, hi);
		merge(lo, mid, hi);
	}

	private void merge(final int lo, final int mid, final int hi) {
		int i = lo;
		int j = mid + 1;

		for (int k = lo; k <= hi; k++) {
			aux.add(k, list.get(k));
		}

		for (int k = lo; k <= hi; k++) {
			if (i > mid) {
				list.set(k, aux.get(j++));
			} else if (j > hi) {
				list.set(k, aux.get(i++));
			} else if (aux.get(j) < aux.get(i)) {
				list.set(k, aux.get(j++));
			} else {
				list.set(k, aux.get(i++));
			}
		}
	}

	public static void main(final String[] args) {
		final MergeSort ms = new MergeSort(1000);
		ms.process();
	}

}
