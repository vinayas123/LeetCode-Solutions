class Solution {
    public boolean isHappy(int n) {
        return calculateHappy(n, new HashSet<Integer>());
    }
    
    public boolean calculateHappy(int n, HashSet<Integer> seen){
        int sum = 0;
        seen.add(n);
        while(n > 0){
            sum += (n % 10) * (n %10);
            n = n / 10;
        }
        if(sum == 1)
            return true;
        if(seen.contains(sum))
            return false;
        return calculateHappy(sum, seen);
        
    }
}
