class Solution {
    public static int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        HashMap<Integer, List<Integer>> graph = new HashMap<>();
​
        for(int i = 0; i < manager.length; i ++){
            if(graph.get(manager[i]) == null){
                graph.put(manager[i],new ArrayList<>());
            }
            graph.get(manager[i]).add(i);
        }
​
        return bfs(graph, informTime, headID);
    }
​
    public static int bfs(HashMap<Integer, List<Integer>> graph, int [] informTime, int current ){
        int max = 0;
        if(!graph.containsKey(current))
            return max;
        for(Integer reportee : graph.get(current)) {
            max = Math.max(max, bfs(graph, informTime, reportee));
        }
        return max + informTime[current];
    }
}
