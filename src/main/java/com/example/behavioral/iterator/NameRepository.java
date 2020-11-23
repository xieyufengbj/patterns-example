package com.example.behavioral.iterator;

/**
 * Copyright (C), 2020
 * FileName: NameRepository
 *
 * @author: xieyufeng
 * @date: 2020/11/23 17:08
 * @description:
 */
public class NameRepository implements Container {

    private static final String[] names = {"Mary", "Jony", "Tom", "Amy"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private static class NameIterator implements Iterator {
        int index = 0;
        @Override
        public boolean hasNext() {
            if (index < names.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return names[index++];
        }
    }
}
