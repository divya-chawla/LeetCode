class Solution {
    public int[] decompressRLElist(int[] nums) {
        //finding the length of new array
        int newLength = 0;
        for(int i = 0; i < nums.length ; i+=2 ){
            newLength = newLength + nums[i];
        }
        
        int[] decompressedList = new int[newLength];
        int index = 0;
        
        for(int i = 0; i < nums.length; i+=2){
            int count = 0;
            int freq = nums[i];
            int value = nums[i+1];
            while(count != freq){
                decompressedList[index + count] = value;
                count++;
            }
            //update the index to after freq 
            index = index + count;
        }
        
        return decompressedList;
    }
}