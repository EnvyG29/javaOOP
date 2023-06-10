package dz.dz3MyClass;

import java.util.Iterator;

import java.util.NoSuchElementException;

public class LinkedList087<T> implements Iterable<T> {
    private Element<T> head;
    private Element<T> tail;
    private int size;
    private int num;

    public LinkedList087() {
        head = null;
        tail = null;
        size = 0;
    }

    public void add(T value) {
        Element<T> element = new Element<>(value);
        if (size == 0) {
            head = element;
        } else {
            tail.next = element;
            element.prev = tail;
        }
        tail = element;
        size++;
    }

    public void addFirst(T value) {
        Element<T> element = new Element<>(value);
        if (size == 0) {
            head = element;
            tail = element;
        } else {
            head.prev = element;
            element.next = head;
            head = element;
        }
        size++;
    }

    public void remove(T value, boolean isAll) {
        Element<T> current = head;
        while (current != null) {
            if (current.value.equals(value)) {
                if (current.prev == null) {
                    head = current.next;
                    head.prev = null;
                } else if (current.next == null) {
                    tail = current.prev;
                    tail.next = null;
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                size--;
                if (!isAll) {
                    return;
                }
            }
            current = current.next;
        }
    }

    public T get(int index) {
        if (index >= 0 && index < size) {
            Element<T> current = head;
            num = 0;
            while (current != null) {
                if (num == index) {
                    return current.value;
                }
                num++;
                current = current.next;
            }
        }
        if (index >= -size && index < 0) {
            Element<T> current = tail;
            num = -1;
            while (current != null) {
                if (num == index) {
                    return current.value;
                }
                num--;
                current = current.prev;
            }
        }
        return null;
    }

    public void set(int index, T newValue) {
        Element<T> current = head;
        num = 0;
        if (index >= 0 && index < size) {
            while (current != null) {
                if (num == index) {
                    current.value = newValue;
                    return;
                }
                num++;
                current = current.next;
            }
        }
    }

    public void removeFirst() {
        if (size == 0) {
            throw new NoSuchElementException();
        } else if (size == 1) {
            head = null;
            tail = null;
        } else {
            head = head.next;
        }
        size--;
    }

    public void removeLast() {
        if (size == 0) {
            throw new NoSuchElementException();
        } else if (size == 1) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }

    public void clear() {
        size = 0;
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return size > 0;
    }

    public int size() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public T next() {
                return null;
            }
        };
    }


    private static class Element<T> {
        private T value;
        private Element<T> next;
        private Element<T> prev;

        public Element(T value) {
            this.value = value;
            next = null;
            prev = null;
        }
    }
}