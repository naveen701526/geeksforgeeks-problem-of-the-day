class CheckGraphIsTree {
    public boolean solve(ArrayList<ArrayList<Integer>> graph,boolean[] vis,int prev,int vertex){
        vis[vertex]=true;
        for(int i:graph.get(vertex))
        if(i==prev)
        continue;
        else
        if(!vis[i])
        {if(!solve(graph,vis,vertex,i))
        return false;}
        else return false;
        return true;
    }
    public boolean isTree(int n, int m, ArrayList<ArrayList<Integer>> edges) 
    {
        // code here
        boolean vis[]=new boolean[n];
        //Set<Integer> set=new HashSet<Integer>();
        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList());
        }
        for(int i=0;i<m;i++){
            graph.get(edges.get(i).get(0)).add(edges.get(i).get(1));
            graph.get(edges.get(i).get(1)).add(edges.get(i).get(0));
        }
        if(!solve(graph,vis,-1,0))
        return false;
        for(boolean i:vis)
        if(!i)
        return false;
        return true;

        
    }
}
