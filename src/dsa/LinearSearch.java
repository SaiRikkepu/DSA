package dsa;

public class LinearSearch {

    public static void main(String[] args) {
        int[] source = {2,5,8,5,9,1,12,17};
        int targetItem = 17;
minArray(source);
//        for(int i = 0; i<source.length ;i++){
//            if(targetItem == source[i]){
//                System.out.println(i);
//            }
//        }
    }

    public static void minArray(int[] array){
        int min = array[0];
        for(int i =0; i < array.length;i++){
            if(min > array[i]){
                min = array[i];
            }
        }
        System.out.println(min);
    }
}
