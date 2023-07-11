package org.example.JavaGeneric;

class ClassTest<T> {
    T obj;
    ClassTest(T obj) { this.obj = obj; } // constructor
    public T getObject() { return this.obj; }
}
