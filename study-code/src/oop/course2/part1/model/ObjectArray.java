package oop.course2.part1.model;

import java.util.Arrays;

public class ObjectArray {

    private final int DEFAULT_CAPACITY = 5; // 수정불가(final) => 상수
    private Object[] elements;
    private int size = 0;

    // 생성 동작
    public ObjectArray() {
        this(5);
    }

    public ObjectArray(int capacity) {
        elements = new Object[capacity]; // 원하는 크기의 배열 생성
    }

    // 저장 동작
    public void add(Object element) {
        if (size == elements.length) {
            // 크기를 2배로 늘리는 작업
            ensureCapacity();
        }
        elements[size++] = element;
    }

    // 읽기 동작
    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("범위초과");
        }
        // index 체크
        return elements[index];
    }

    // 원소의 개수를 얻는 동작
    public int size() {
        return size;
    }

    private void ensureCapacity() {
        int newCapacity = elements.length * 2;
        elements = Arrays.copyOf(elements, newCapacity);
    }
}