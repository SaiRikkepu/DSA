package dsa;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

public class Fibonacci {

    public static void main(String[] args) {

        // 0,1,1,2,3,5,8
        int firstNum = 0;
        int secondnum = 1;
        int numberTillSeries = 7;
        int countStarts = 2;

        while(countStarts <=numberTillSeries){
            int temporaryNum = secondnum; // Temporary will be secondNum
            secondnum = secondnum + firstNum; //0 +1
            firstNum = temporaryNum; // firstNum will be 1
            countStarts++;
        }

        System.out.println(secondnum);

        System.out.println("hello");
    }
}
