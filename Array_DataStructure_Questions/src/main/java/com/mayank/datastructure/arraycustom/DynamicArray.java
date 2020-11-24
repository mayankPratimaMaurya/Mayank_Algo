package com.mayank.datastructure.arraycustom;

public class DynamicArray {

    String[] element;
    int lastIndex = -1;
    int capacity;

    public DynamicArray(int capacity){
        this.capacity = capacity;
        element = new String[this.capacity];
    }

    public void add(String name) {

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

        String[] elementTemp = new String[capacity];
        for(int i=0; i < count(); i++){
            elementTemp[i]= this.element[i];
        }
        this.element = elementTemp;
    }

    //O(1)
    public String objectAtIndex(int index){
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
        String[] tempList = new String[count()];
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

    public String objectAtLastIndex(){

        return element[lastIndex];
    }

}
