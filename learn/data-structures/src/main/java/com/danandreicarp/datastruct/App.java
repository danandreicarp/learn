package com.danandreicarp.datastruct;

public class App {
    public static void main(String[] args) {
        Integer[] elements1 = {3,5,2,4,1,6};
        Integer[] elements2 = {5,3,4,1,6,7,2};

        PriorityQueueHeap<Integer> priorityQueueHeap = new PriorityQueueHeap<>(elements2);

        System.out.println(priorityQueueHeap);
    }
}
