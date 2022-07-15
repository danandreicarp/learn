package com.danandreicarp.datastruct;

import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class PriorityQueueHeapTest {

    private static final int LOOPS = 100;
    private static final int SIZE = 50;
    private static final PriorityQueueHeap<Integer> heap = new PriorityQueueHeap<>();


    @Test
    @Order(1)
    void testAdd() {
        heap.add(3);
        assertTrue(heap.isMinHeap(0));
        heap.add(4);
        assertTrue(heap.isMinHeap(0));
        heap.add(5);
        assertTrue(heap.isMinHeap(0));
        heap.add(2);
        assertTrue(heap.isMinHeap(0));
        heap.add(1);
        assertTrue(heap.isMinHeap(0));
        heap.add(1);
        assertTrue(heap.isMinHeap(0));
        heap.add(6);
        assertTrue(heap.isMinHeap(0));
        System.out.println("END of add: " + heap);
    }

    @Test
    @Order(2)
    void testPoll() {
        heap.poll();
        assertTrue(heap.isMinHeap(0));
        heap.poll();
        assertTrue(heap.isMinHeap(0));
        heap.poll();
        assertTrue(heap.isMinHeap(0));
        System.out.println("END of poll: " + heap);
    }

    @Test
    @Order(3)
    void testContains() {
        assertTrue(heap.contains(3));
        assertTrue(heap.contains(4));
        assertTrue(heap.contains(5));
        assertTrue(heap.contains(6));
        assertFalse(heap.contains(1));
        assertFalse(heap.contains(2));
    }

    @Test
    @Order(4)
    void testPeek() {
        assertEquals(heap.peek(),3);
        heap.poll();
        assertEquals(heap.peek(),4);
        assertTrue(heap.isMinHeap(0));
        System.out.println("END of peek: " + heap);
    }

    @Test
    @Order(5)
    void testRemove() {
        heap.remove(6);
        assertTrue(heap.isMinHeap(0));
        heap.add(1);
        heap.add(2);
        heap.add(6);
        assertTrue(heap.isMinHeap(0));
        heap.remove(5);
        assertTrue(heap.isMinHeap(0));
        System.out.println("END of remove: " + heap);
    }

    @Test
    @Disabled
    public void testHeapify() {

        for (int i = 0; i < LOOPS; i++) {

            Integer[] elements = generateArray();
            System.out.println("elements: " +
                    Arrays.stream(elements).map(Object::toString).collect(Collectors.joining(",")));
            PriorityQueueHeap<Integer> pq = new PriorityQueueHeap<>(elements);
            System.out.println("pq     : " + pq);

            PriorityQueue<Integer> pq2 = new PriorityQueue<>(elements.length);
            pq2.addAll(Arrays.asList(elements));
            System.out.println("pq2    : " + pq2);

            while (!pq2.isEmpty()) {
                Integer poll1 = pq.poll();
                Integer poll2 = pq2.poll();
                assertEquals(poll1, poll2);
            }
        }
    }

    private Integer[] generateArray() {
        int size = (int) Math.ceil(Math.random() * SIZE);
        Integer[] elements = new Integer[size];
        for (int i = 0; i < size; i++) {
            elements[i] = (int) Math.ceil(Math.random() * SIZE);
        }
        return elements;
    }
}