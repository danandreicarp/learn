package com.danandreicarp.algorithms.sort;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.danandreicarp.algorithms.util.AlgorithmsUtil;

public class BucketSort extends Sorter<Integer> {
	private static List<Integer> list;
	private static Map<Integer, List<Integer>> buckets;

	public BucketSort(int size) {
		list = AlgorithmsUtil.generateLinkedList(size);
		buckets = new TreeMap<Integer, List<Integer>>();
	}

	@Override
	public void sort(List<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			createBuckets(list, i);
		}
		
		extract();
	}

	private void createBuckets(List<Integer> list, int i) {
		int key = hash(list.get(i));
		List<Integer> bucketList = buckets.get(key);
		
		if (bucketList == null) {
			bucketList = new LinkedList<Integer>();
		}
		
		bucketList.add(list.get(i));
		buckets.put(key, bucketList);
	}
	
	private Integer hash(Integer i) {
		return i / 10;
	}
	
	private void extract() {
		int i = 0;

		for (Integer key : buckets.keySet()) {
			List<Integer> bucket = buckets.get(key);
			new InsertionSort().sort(bucket);
			
			for (int j = 0; j < bucket.size(); j++) {
				list.set(i++, bucket.get(j));
			}
		}
	}
	
	public static void main(String[] args) {
		BucketSort bs = new BucketSort(100);
		bs.process(list);
	}
	
}
