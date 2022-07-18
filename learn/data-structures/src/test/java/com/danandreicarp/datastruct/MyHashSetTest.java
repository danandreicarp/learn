package com.danandreicarp.datastruct;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyHashSetTest {

    private MyHashSet set = new MyHashSet(1);

    @Test
    void testAdd() {
        set.add(1);
        assertEquals(1, set.size());
        assertEquals(1, set.get());
    }


}