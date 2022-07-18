package com.danandreicarp.datastruct;

public class MyHashSet {

    private Object[] keys;
    private int size = 0;
    private final double loadFactor;
    private static final Object TOMBSTONE = new Object();

    public MyHashSet() {
        keys = new Object[8];
        loadFactor = 0.75;
    }

    public MyHashSet(int capacityPowerOfTwo) {
        this(capacityPowerOfTwo, 0.75);
    }

    public MyHashSet(int capacityPowerOfTwo, double loadFactor) {
        this.keys = new Object[(int) Math.pow(2, capacityPowerOfTwo)];
        this.loadFactor = loadFactor;
    }

    public void add(Object key) {
        if (key == null) return;
        resize();
        insertKeyIntoSet(key, keys);
        ++size;
    }

    public int size() {
        return size;
    }

    public Object get() {
        for (Object key : keys) {
            if (!key.equals(TOMBSTONE)) {
                remove(key);
                return key;
            }
        }
        return null;
    }

    private void resize() {
        if (keys.length * loadFactor > size) return;

        int newSize = 0;
        Object[] newKeys = new Object[keys.length * 2];
        for (Object key : keys) {
            if (!key.equals(TOMBSTONE)) {
                insertKeyIntoSet(key, newKeys);
                ++newSize;
            }
        }
        if (size != newSize) {
            size = newSize;
        }
        keys = newKeys;
    }

    private int normalizeIndex(int hash, int length) {
        return Math.abs(hash) % length;
    }

    private void insertKeyIntoSet(Object key, Object[] keys) {
        int x = 1;
        int hash = key.hashCode();
        int index = normalizeIndex(hash, keys.length);

        while (keys[index] != null || !keys[index].equals(TOMBSTONE)) {
            index = normalizeIndex(hash + probe(x++), keys.length);
        }
        keys[index] = key;
    }

    private int probe(int x) {
        return (x * x + x) / 2;
    }

    public boolean contains(Object key) {
        if (key == null) return false;

        int index = getIndex(key);
        return keys[index] != null;
    }

    public void remove(Object key) {
        if (key == null) return;

        int index = getIndex(key);
        if (keys[index] != null) {
            keys[index] = TOMBSTONE;
            --size;
        }
    }

    private int getIndex(Object key) {
        int x = 1;
        int hash = key.hashCode();
        int index = normalizeIndex(hash, keys.length);

        while (keys[index] != null && !keys[index].equals(key)) {
            index = normalizeIndex(hash + probe(x++), keys.length);
        }
        return index;
    }
}
