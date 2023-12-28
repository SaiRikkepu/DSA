package dsa;

public class TwoDimensionalArray {

    public static void main(String[] args) {
        
        int[][] arr = {{1,2,3},{4,5,6},{8,9,0,34},{56,567,87,99,123}};
        int target = 87;
        int resultArray = searchIn2DArray(arr,target);
        System.out.println(resultArray);
    }

    private static int searchIn2DArray(int[][] arr, int target) {
        //Iterate rows
        for(int row =0; row < arr.length;row++){
            //Columns
            for(int column=0; column < arr[row].length;column++){
                if(target == arr[row][column]){
                    return 1;
                }
            }
        }
        return -1;
    }


}
