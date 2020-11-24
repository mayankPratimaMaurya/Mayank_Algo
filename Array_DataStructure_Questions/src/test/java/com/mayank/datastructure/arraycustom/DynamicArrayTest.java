package com.mayank.datastructure.arraycustom;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DynamicArrayTest {
    @Test
    public void addElements() throws Exception{

        DynamicArray studentList = new DynamicArray(10);
        int beforeAddingCount = studentList.count();
        studentList.add("Mayank");
        assertTrue(studentList.count() == beforeAddingCount+1);
        assertEquals("Mayank",studentList.objectAtIndex(0));

        studentList.add("Pratima");
        assertTrue(studentList.count() == beforeAddingCount+2);
        assertEquals("Pratima",studentList.objectAtIndex(1));
    }

    @Test
    public void addElementMoreThanCapacity() throws Exception{
        DynamicArray studentList = new DynamicArray(3);
        studentList.add("Mayank");
        studentList.add("Pratima");
        studentList.add("Satyam");
        assertTrue(studentList.count() == 3);
        studentList.add("Mayank");
        studentList.add("Pratima");
        studentList.add("Satyam");
        assertTrue(studentList.count() == 6);
        studentList.add("Mayank");
        studentList.add("Pratima");
        studentList.add("Satyam");
        assertTrue(studentList.count() == 9);
        assertEquals(12, studentList.capacity);
        studentList.add("Satyam");
        studentList.add("Satyam");
        studentList.add("Satyam");
        assertEquals(12, studentList.capacity);
        studentList.add("Satyam");
        assertEquals(24, studentList.capacity);

    }

    @BeforeEach
    void setUp() {

    }

    @Test
    public void removeLastElementFromArray() throws Exception{

        DynamicArray studentList = new DynamicArray(1);
        studentList.add("Mayank");
        studentList.add("Pratima");
        studentList.add("Satyam");
        studentList.removeLast();
        assertEquals(2,studentList.count());
        assertEquals("Pratima",studentList.objectAtLastIndex());
    }

    @Test
    public void removeFirstElementFromArray() throws Exception{
        DynamicArray studentList = new DynamicArray(1);
        studentList.add("Mayank");
        studentList.add("Pratima");
        studentList.add("Satyam");
        studentList.removeFirst();
        assertEquals(2,studentList.count());
        assertEquals("Pratima",studentList.objectAtIndex(0));
        assertEquals("Satyam",studentList.objectAtIndex(1));

    }

    @Test
    public void removeElementFromMiddle() throws Exception{
        DynamicArray studentList = new DynamicArray(1);
        studentList.add("Mayank");
        studentList.add("Pratima");
        studentList.add("Satyam");
        studentList.removeElementFromIndex(1);
        assertEquals(2,studentList.count());
        assertEquals("Mayank",studentList.objectAtIndex(0));
        assertEquals("Satyam",studentList.objectAtIndex(1));

    }



}