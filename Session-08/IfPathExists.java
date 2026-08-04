class Solution {
    public boolean solve(List<List<Integer>> adjList, int start, int dest, boolean visited[])
    {
        if(start==dest)
        return true;

        for(int i=0; i<adjList.get(start).size(); i++)
        {
            int v=adjList.get(start).get(i);
            if(!visited[v])
            {
                visited[v]=true;
                if(solve(adjList, v, dest, visited))
                return true;
            }
        }
        return false;
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adjList=new ArrayList<>();
        for(int i=0; i<n; i++)
        {
            adjList.add(new ArrayList<>());
        }
        for(int e[]: edges)
        {
            int u=e[0];
            int v=e[1];
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }

        boolean visited[]=new boolean[n];
        Arrays.fill(visited, false);
        visited[source]=true;
        return solve(adjList, source, destination, visited);
    }
}