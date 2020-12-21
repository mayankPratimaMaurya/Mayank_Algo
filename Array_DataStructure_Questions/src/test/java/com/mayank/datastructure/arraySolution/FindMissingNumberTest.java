package com.mayank.datastructure.arraySolution;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FindMissingNumberTest {

    @Test
    public void fastsearchMissingNumberWithNoOffset(){

        int [] numbers = {0,1,2,3,4,5,6,7,8,9,11};
        FindMissingNumber missingTest = new FindMissingNumber(numbers);
        System.out.println(missingTest.searchMissingNumberFast());
        assertTrue(missingTest.searchMissingNumberFast() == 10);

        int [] numbers1 = {0,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
        missingTest.numberList = numbers1;
        System.out.println(missingTest.searchMissingNumberFast());
        assertTrue(missingTest.searchMissingNumberFast() == 1);

        int [] numbers2 = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,15,16,17};
        missingTest.numberList = numbers2;
        System.out.println(missingTest.searchMissingNumberFast());
        assertTrue(missingTest.searchMissingNumberFast() == 14);

        int [] numbers3 = {0,2};
        missingTest.numberList = numbers3;
        System.out.println(missingTest.searchMissingNumberFast());
        assertTrue(missingTest.searchMissingNumberFast() == 1);
    }

    @Test
    public void fastsearchMissingNumberWithOffset(){

        int [] numbers = {3,4,5,6,7,8,9,10,12,13,14,15};
        FindMissingNumber missingTest = new FindMissingNumber(numbers);
        System.out.println(missingTest.searchMissingNumberFast());
        assertTrue(missingTest.searchMissingNumberFast() == 11);

        int [] numbers1 = {3,4,6,7,8,9,10,11,12,13,14,15};
        missingTest.numberList = numbers1;
        System.out.println(missingTest.searchMissingNumberFast());
        assertTrue(missingTest.searchMissingNumberFast() == 5);

        int [] numbers2 = {3,5};
        missingTest.numberList = numbers2;
        System.out.println(missingTest.searchMissingNumberFast());
        assertTrue(missingTest.searchMissingNumberFast() == 4);

    }

    @Test
    public void fastnoMissingNumber(){

        int [] numbers = {3,4,5,6,7,8,9,10,11};
        FindMissingNumber missingTest = new FindMissingNumber(numbers);
        System.out.println(missingTest.searchMissingNumberFast());
        assertTrue(missingTest.searchMissingNumberFast() == 0);

        int [] numbers1 = {3};
        missingTest.numberList=numbers1;
        System.out.println(missingTest.searchMissingNumberFast());
        assertTrue(missingTest.searchMissingNumberFast() == 0);

    }

    @Test
    public void searchMissingNumberWithNoOffset(){

        int [] numbers = {0,1,2,3,4,5,6,7,8,9,11};
        FindMissingNumber missingTest = new FindMissingNumber(numbers);
        System.out.println(missingTest.searchMissingNumber());
        assertTrue(missingTest.searchMissingNumber() == 10);

        int [] numbers1 = {0,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
        missingTest.numberList = numbers1;
        System.out.println(missingTest.searchMissingNumber());
        assertTrue(missingTest.searchMissingNumber() == 1);

        int [] numbers2 = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,15,16,17};
        missingTest.numberList = numbers2;
        System.out.println(missingTest.searchMissingNumber());
        assertTrue(missingTest.searchMissingNumber() == 14);

        int [] numbers3 = {0,2};
        missingTest.numberList = numbers3;
        System.out.println(missingTest.searchMissingNumber());
        assertTrue(missingTest.searchMissingNumber() == 1);
    }

    @Test
    public void searchMissingNumberWithOffset(){

        int [] numbers = {3,4,5,6,7,8,9,10,12,13,14,15};
        FindMissingNumber missingTest = new FindMissingNumber(numbers);
        System.out.println(missingTest.searchMissingNumber());
        assertTrue(missingTest.searchMissingNumber() == 11);

        int [] numbers1 = {3,4,6,7,8,9,10,11,12,13,14,15};
        missingTest.numberList = numbers1;
        System.out.println(missingTest.searchMissingNumber());
        assertTrue(missingTest.searchMissingNumber() == 5);

        int [] numbers2 = {3,5};
        missingTest.numberList = numbers2;
        System.out.println(missingTest.searchMissingNumber());
        assertTrue(missingTest.searchMissingNumber() == 4);

    }

    @Test
    public void noMissingNumber(){

        int [] numbers = {3,4,5,6,7,8,9,10,11};
        FindMissingNumber missingTest = new FindMissingNumber(numbers);
        System.out.println(missingTest.searchMissingNumber());
        assertTrue(missingTest.searchMissingNumber() == 0);

        int [] numbers1 = {3};
        missingTest.numberList=numbers1;
        System.out.println(missingTest.searchMissingNumber());
        assertTrue(missingTest.searchMissingNumber() == 0);

    }
}
