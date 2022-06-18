class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList[] graph = new ArrayList[numCourses];
        
        for (int i = 0; i < numCourses; i++) {
             graph[i] = new ArrayList<Integer>();
        }
        
        boolean[] memo = new boolean[numCourses];
        boolean[] visited = new boolean[numCourses];
        
        for (int i = 0; i < prerequisites.length; i++) {
            graph[prerequisites[i][1]].add(prerequisites[i][0]);
        }
        
        for(int i = 0; i < numCourses; i++) {
            if(!dfs(graph, i, visited, memo)) return false;
        }
        
        return true;
    }
    
    public boolean dfs(ArrayList[] graph, int course, boolean[] visited, boolean[] memo) {
        if(visited[course]) return false;
        if(memo[course]) return true;
        
        visited[course] = true;
        
        for(int i = 0; i < graph[course].size(); i++) {
            if (!dfs(graph, (int)graph[course].get(i), visited, memo)) {
               return false;
            }
        }
        
        visited[course] = false;
        memo[course] = true;
        
        return true;
    }
}
