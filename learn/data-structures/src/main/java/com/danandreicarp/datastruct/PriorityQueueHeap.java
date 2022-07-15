package com.danandreicarp.datastruct;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class PriorityQueueHeap<T extends Comparable<T>> {

    private final List<T> heap;

    public PriorityQueueHeap() {
        heap = new ArrayList<>();
    }

    public PriorityQueueHeap(int size) {
        heap = new ArrayList<>(size);
    }

    public PriorityQueueHeap(T[] elements) {
        int size = elements.length;
        heap = new ArrayList<>(size);

        heap.addAll(Arrays.asList(elements));
        heapify();
    }

    public PriorityQueueHeap(Collection<T> elements) {
        heap = new ArrayList<>(elements);
        heapify();
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }

    public void clear() {
        heap.clear();
    }

    public int size() {
        return heap.size();
    }

    public void add(T element) {
        if (element == null) {
            throw new IllegalArgumentException("must not be null");
        }
        heap.add(element);
        swim(heap.size() - 1);
    }

    public boolean remove(T element) {
        if (element == null) {
            return false;
        }
        for (int i = 0; i < heap.size(); i++) {
            T node = heap.get(i);
            if (node.equals(element)) {
                heap.set(i, heap.get(heap.size() - 1));
                heap.remove(heap.size() - 1);
                heapify();
                return true;
            }
        }
        return false;
    }

    private void swim(int index) {

        while (index > 0) {
            int parent = (index - 1) / 2;
            if (less(index, parent)) {
                swap(parent, index);
            } else {
                break;
            }
            index = parent;
        }
    }

    private void sink(int index) {
        while (index < heap.size() / 2) {
            int left = 2 * index + 1;
            int rght = 2 * index + 2;

            int smallest = left;
            if (rght < heap.size() && less(rght, left)) {
                smallest = rght;
            }

            if (left < heap.size() && less(smallest, index)) {
                swap(index, smallest);
                index = smallest;
            } else {
                return;
            }
        }
    }

    public boolean contains(T element) {
        for (T node : heap) {
            if (node.equals(element)) {
                return true;
            }
        }
        return false;
    }

    public T peek() {
        if (heap.isEmpty()) {
            return null;
        }
        return heap.get(0);
    }

    public T poll() {
        if (heap.isEmpty()) {
            return null;
        }
        T node = heap.get(0);
        heap.set(0, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);
        heapify();
        return node;
    }

    private void heapify() {
        for (int i = (heap.size()/2 - 1); i >= 0; i--) {
            sink(i);
        }
    }

    private boolean less(int idx1, int idx2) {
        return heap.get(idx1).compareTo(heap.get(idx2)) < 0;
    }

    public void swap(int index1, int index2) {
        T temp = heap.get(index1);
        heap.set(index1, heap.get(index2));
        heap.set(index2, temp);
    }

    @Override
    public String toString() {
        return heap.toString();
    }

    public boolean isMinHeap(int index) {
        int left = (index * 2) + 1;
        int rght = (index * 2) + 2;

        if (left < heap.size()) {
            if (less(left, index)) {
                return false;
            }
        } else {
            return true;
        }

        if (rght < heap.size()) {
            if (less(rght, index)) {
                return false;
            }
        } else {
            return true;
        }

        return isMinHeap(left) && isMinHeap(rght);
    }
}
