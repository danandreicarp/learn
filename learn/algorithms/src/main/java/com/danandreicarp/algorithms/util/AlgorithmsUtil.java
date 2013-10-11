package com.danandreicarp.algorithms.util;

import java.util.LinkedList;
import java.util.List;

public class AlgorithmsUtil {

	public static List<Integer> generateLinkedList(final int size) {
		final List<Integer> list = new LinkedList<Integer>();

		for (int i = 0; i < size; i++) {
			list.add(Double.valueOf(Math.random() * 1000).intValue());
		}

		return list;
	}

	public static void swap(final List<Integer> list, final Integer i, final Integer j) {
		final Integer temp = list.get(j);
		list.set(j, list.get(i));
		list.set(i, temp);
	}

	public static long time(final String label) {
		final long time = System.currentTimeMillis();
		System.out.println(label + ": " + time);
		return time;
	}
}
