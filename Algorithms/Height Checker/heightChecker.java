class Solution {
    public int heightChecker(int[] heights) {
        int len = heights.length;
        int count = 0;
        int  i = 0;
        int[] sorted = new int[len];
        for(i = 0; i < len; i++){
            sorted[i] = heights[i];
        }
        Arrays.sort(sorted);
        for( i = 0; i < len; i++ ){
            if(heights[i] != sorted[i]){
                count ++;
            }
        }
        return count;
    }
}