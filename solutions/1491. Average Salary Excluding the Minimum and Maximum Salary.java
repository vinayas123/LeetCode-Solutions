class Solution {
    public double average(int[] salary) {
        
        int min = salary[0];
        int max = salary[0];
        int SUM = 0;
        for(int i = 0 ; i < salary.length;i++){
            if(salary[i] < min)
                min = salary[i];
            if(salary[i] > max )
                max = salary[i];
            
            SUM += salary[i];
        }
        
        double result = (double)(SUM - (min + max)) /(double) (salary.length - 2);
        return result;
        
    }
}
