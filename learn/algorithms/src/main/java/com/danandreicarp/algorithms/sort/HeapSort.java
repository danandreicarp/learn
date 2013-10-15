package com.danandreicarp.algorithms.sort;

import java.util.List;

import com.danandreicarp.algorithms.util.AlgorithmsUtil;

public class HeapSort extends Sorter<Integer> {

	private static List<Integer> list;
	
	public HeapSort(int size) {
		list = AlgorithmsUtil.generateLinkedList(size);
	}
	
	@Override
	public void sort(List<Integer> list) {
		buildHeap();
		for (int i = list.size() - 1; i > 0; i--) {
			AlgorithmsUtil.swap(list, 0, i);
			heapify(0, i);
		}
	}
	
	private void buildHeap() {
		
		int start = Double.valueOf(Math.floor(list.size() / 2.0)).intValue() - 1;
		
		for (int i = start; i >= 0; i--) {
			heapify(i, list.size());
		}
	}
	
	private void heapify(int idx, int max) {
		int left = idx * 2 + 1;
		int rght = idx * 2 + 2;
		
		int lrgst;
		
		if (left < max && list.get(left) > list.get(idx)) {
			lrgst = left;
		} else {
			lrgst = idx;
		}
		
		if (rght < max && list.get(rght) > list.get(lrgst)) {
			lrgst = rght;
		}
		
		if (lrgst != idx) {
			AlgorithmsUtil.swap(list, idx, lrgst);
			heapify(lrgst, max);
		}
	}
	
	public static void main(String[] args) {
		HeapSort hs = new HeapSort(1000);
		hs.process(list);
	}

}
