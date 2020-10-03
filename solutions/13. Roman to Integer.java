class Solution {
   public int romanToInt(String s) {
        int intValue = 0;
        for(int i=s.length()-1;i >=0;i-- ){
            
            switch(s.charAt(i)){
                    
                case'I':
                    if(i!=s.length()-1 && (s.charAt(i+1) == 'V' || s.charAt(i+1) == 'X'))
                        intValue = intValue - 1;
                    else
                        intValue = intValue + 1;    
                    break;
                    
                case 'V':
                    
                    intValue = intValue + 5;
                    break;
                case 'X':
                     if(i!=s.length()-1 && (s.charAt(i+1) == 'L' || s.charAt(i+1) == 'C'))
                        intValue = intValue - 10;
                    else
                        intValue = intValue + 10;
                    break;
                case 'L':
                    
                    intValue = intValue + 50;
                    break;
                case 'C':
                     if(i!=s.length()-1 && (s.charAt(i+1) == 'D' || s.charAt(i+1) == 'M'))
                        intValue = intValue - 100;
                    else
                        intValue = intValue + 100;
                    break;
                case 'D':
                    intValue = intValue + 500;
                    break;
                case 'M':
                    intValue = intValue + 1000;
                    break;
            }
            
        }
        return intValue;
    }
}
