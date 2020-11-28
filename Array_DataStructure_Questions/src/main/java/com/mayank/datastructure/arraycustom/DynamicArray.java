package com.mayank.datastructure.arraycustom;

public class DynamicArray<T> {

    T[] element;
    int lastIndex = -1;
    int capacity;

    public DynamicArray(int capacity){
        this.capacity = capacity;
        element = (T[])new Object[this.capacity];
    }

    public void add(T name) {

        if(count() >= this.capacity)
            increaseCapacity();
        lastIndex++;
        this.element[lastIndex] = name;
    }

    private  void increaseCapacity() {

        this.capacity = this.capacity*2;
        copyContentToNewMemoryStack();
    }

    private void copyContentToNewMemoryStack() {

        T[] elementTemp = (T[])new Object[capacity];;
        for(int i=0; i < count(); i++){
            elementTemp[i]= this.element[i];
        }
        this.element = elementTemp;
    }

    //O(1)
    public T objectAtIndex(int index){
        return element[index];
    }

    public int count() {
        return lastIndex +1;
    }

    //O(1)
    public void removeLast() {
        element[lastIndex] = null;
        lastIndex--;
    }

    //O(n)
    public void removeFirst(){
        shiftElementsToLeftFromIndex(0);
    }

    private void shiftElementsToLeftFromIndex( int deleteIndex) {

        lastIndex--;
        T[] tempList = (T[])new Object[count()];
        boolean reachedDeleteIndex = false;
        for(int i=0; i< count(); i++){

            if(i == deleteIndex){
                reachedDeleteIndex  = true;
            }
            if(reachedDeleteIndex){
                tempList[i] = element[i+1];
            }
            else {
                tempList[i] = element[i];
            }
        }
        element = tempList;
    }

    public void removeElementFromIndex(int index){
        shiftElementsToLeftFromIndex(index);

    }

    public T objectAtLastIndex(){
        return element[lastIndex];
    }

}
