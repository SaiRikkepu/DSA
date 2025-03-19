//abcdcba
    private static boolean isPalindrome(String value){
        int left = 0;
        int right = value.length()-1;
        while(left <right){
            if(value.charAt(left) != value.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // 3,5,8,9,10 target 14
    private static boolean isTwoSum(int[] arr , int target){
        int left = 0;
        int right = arr.length -1;
        while(left < right){
            int total = arr[left] + arr[right];
            if(total == target){
                return true;
            }
            if(total >target){
                right --;
            }else{
                left ++;
            }

        }
        return true;
    }

    public static int[] twoSum1(int[] nums, int target) {
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        int[] result=new int[2];
        for(int i=0;i<n;i++){
            //3 2 4
            //6-3 i=0
            //(3,0)
            //i = 1
            //6-2 i = 1
            //(2,1)
            //i = 2 ; 6-4
            //[1,2]
            //6-4 = 2
            if(map.containsKey(target-nums[i])){
                result[1]=i;
                result[0]=map.get(target-nums[i]);
                return result;
            }
            map.put(nums[i],i);
        }
        return result;
    }

    public static int[] twoSumArray(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;
        int[] result = new int[2];
        while(left< right){
            int sum = nums[left] + nums[right];
            if(sum == target){
                result[0] = left;
                result[1] = right;
                return result;
            }
            if(sum > target){
                right--;
            }else{
                left++;
            }

        }
        return new int[]{0,0};
    }
