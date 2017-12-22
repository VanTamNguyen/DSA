package com.tamco.dsa.sorting;

public class SortableItem {

    private int value;

    public SortableItem(int value) {
        this.value = value;
    }

    public boolean lessThan(SortableItem other) {
        return this.value < other.getValue();
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
