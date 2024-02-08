class CheckIfAllLeavesAreAtSameLevel
{
    boolean check(Node root)
    {
    // Your code here
        return helper(root,1);
    }
    int h = 0;
    boolean first = true;
    private boolean helper(Node root, int height){
        if(root == null) return true;
        if(root.left == root.right){
            if(first){
                h=height;    
                first = false;
            }
            else if(height != h) return false;
            return true;
        }
        
        return helper(root.left, height+1) && helper(root.right,height+1); 
    }
}
