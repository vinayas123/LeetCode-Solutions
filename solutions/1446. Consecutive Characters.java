class Solution {
    public int maxPower(String s) {
        int max = 1;
        char c = s.charAt(0);
        int count = 1;
        for(int i = 1; i < s.length(); i++){
            
            if(s.charAt(i) == c){
                count++;
                max = Math.max(count, max);
            }
            else{
                c = s.charAt(i);
                max = Math.max(count, max);
                count = 1;
            }
                
        }
        
        return max;
    }
}
