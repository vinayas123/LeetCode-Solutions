class Solution {
        public int maxArea(int[] input) {
        if(input == null)
            return 0;
        
        int start = 0;
        int end = input.length - 1;
        int max = 0;
        while(start < end) {
            
            int area = (end - start) * Math.min(input[start], input[end]);
            max = Math.max(area, max);
            if(input[start] > input[end]) {
                end--;
            }
            else {
                start++;
            }
        }
        return max;
    }
}
