package dsa.binarySearch;

/**
 * BinarySearch algorithm divides the array into two parts and search based on the target element
 * Its sorted algorithm,Based on the middle element it finds the target
 * Its TimeComplexity i n(logn) bcoz it divides the array into two parts and reduces the time and size
 */
public class BinarySearch {
    public static void main(String[] args) {

        /**
         * find the middle element
         * if middle element is greater than target search in left or else right
         */
        int[] array = {2,6,9,12,15,19,28,89,90,96,120};
        int start = 0;
        int end  = array.length-1;
        int middleElement = (start+end)/2;
        int target = 89;
        if(target > array[middleElement]){
            start = middleElement +1;
        }else if(target < array[middleElement]){
            end = middleElement-1;
        }else {
            target = array[middleElement];
        }

        for(int i =start; i< end;i++ ){
            if(target == array[i]){
                System.out.println("Target Element at indext "+i);
            }
        }

        System.out.print(array[middleElement]);

    }


}
