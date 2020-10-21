class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        
        int count = 0;
        for(int i = 0; i < time.length; i++){
            int check = (60 - (time[i] %60))%60;
            count = count + map.getOrDefault(check, 0);
            map.put(time[i]%60, map.getOrDefault(time[i]%60,0) + 1);
        }
        return count;
    }
}
