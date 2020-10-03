class Solution {
   public boolean wordBreak(String s, List<String> wordDict) {
       
       if(s== null || s.length() == 0)
           return true;
       
      //create hash table
       HashSet<String> dict = new HashSet<String>();
       
       for(String str : wordDict)
           dict.add(str);
       Queue<Integer> queue = new LinkedList<Integer>();
       queue.add(0);
       
       HashSet<Integer> visited = new HashSet<>();
       
       while(!queue.isEmpty()){
           int current = queue.poll();
           for(int i = current + 1; i<= s.length();i++){
               if(visited.contains(i)) continue;
               
               if(dict.contains(s.substring(current,i))){
                   if(i == s.length())
                       return true;
                queue.offer(i);
                visited.add(i);
                   
               }
               
           }
           
       }
​
       return false;
   }
}
