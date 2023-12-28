package dsa;

public class FindNumOfEvenNumbers {

    public static void main(String[] args) {
        findEvenNumbers();
    }

    //Check Number of Digits are there in an array which are even
    //Example (18,123,1756,9) - 18 and 1756 So two evem numbers

    static void findEvenNumbers(){
        int[] numberArray = new int[4];
        numberArray[0] = 18;
        numberArray[1] = 123;
        numberArray[2] = 1756;
        numberArray[3] = 9;
        int count = 0;
        for (int j : numberArray) {
            if (checkIfNumIsEven(j)) {
                count++;
            }
        }

        System .out.println("Number of Even Digits are :"+count);
    }

    private static boolean checkIfNumIsEven(int input) {
        String charLength = String.valueOf(input);
        return charLength.length() % 2 == 0;
    }
}
