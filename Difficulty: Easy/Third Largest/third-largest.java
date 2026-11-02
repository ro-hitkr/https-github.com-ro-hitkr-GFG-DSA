class Solution {
    public int thirdLargest(List<Integer> arr) {
        // code here
        if(arr == null || arr.size() < 3){
            return -1;
        }
        long first = Long.MIN_VALUE;
        long sec = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;
        
        for(int num : arr){
        
            if(num > first){
                third = sec;
               sec= first;
                first = num;
            }else if(num > sec){
                third = sec;
                sec = num;
            }else if(num > third){
                third = num;
            }
        }
        if (third == Long.MIN_VALUE) {
                    return -1;
                }
        return (int)third;
    }
}