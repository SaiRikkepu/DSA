package dsa;

public class MaxWealth {

    public static void main(String[] args) {
        checkMaxAccount();
    }

    //Check If persons account has maximum wealth in his accounts then return his income
    //{{1,4,5},{1,2,3}} - here first person has wealth of 4+1+5- he is rich
    private static void checkMaxAccount() {

        int[][] accounts = {{1,4,5},{2,4,8},{1,2,3}};
        int maxWealth = 0;
        for (int[] row : accounts) {
            int sum = 0;
            for (int column : row) {
                System.out.println("account array" + column);
                sum += column;
            }
            if (sum > maxWealth) {
                maxWealth = sum;
            }
        }
        System.out.println("Max Wealth sum is "+maxWealth);
    }
}
