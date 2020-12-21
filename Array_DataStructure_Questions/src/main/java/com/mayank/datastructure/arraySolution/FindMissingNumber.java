package com.mayank.datastructure.arraySolution;

import java.util.*;

public class FindMissingNumber {

    int[] numberList;

    public FindMissingNumber(int[] numberList){

        this.numberList = numberList;

    }

    //O(N)
   public int searchMissingNumber() {

        int firstNumber = numberList[0];

        for(int index=0;  index< numberList.length; index++){

            int expectedValue = index +firstNumber;
            int currentNumber = numberList[index];

            if(expectedValue != currentNumber){
                int missingNumber = expectedValue;
                return missingNumber;
            }
        }

        return 0;
    }

    //O(log N)

    public int searchMissingNumberFast() {

        int missingNumber = 0;
        int startIndex = 0;
        int middleIndex = 0;
        int endIndex = numberList.length-1;

        if((numberList[endIndex] - numberList[0]) == endIndex){
            return missingNumber;
        }

        //Divide and Conquer.
        while(endIndex-startIndex>1 ||(endIndex-startIndex<=1 && missingNumber==0 ) ){

            middleIndex = getMiddleIndex(startIndex,endIndex);

            int expectedMiddleValue = middleIndex + numberList[0];
            int currentMiddleNumber = numberList[middleIndex];

            if(expectedMiddleValue == currentMiddleNumber)
                startIndex = middleIndex;

            else{
                endIndex = middleIndex;
                missingNumber = expectedMiddleValue;
            }
        }

        return missingNumber;
    }

    private int getMiddleIndex(int startIndex,int lastIndex) {
        int middleIndex= (startIndex +lastIndex+1)/2;
        return middleIndex;
    }

}
