class MergeTwoSortedLinkedListReverseOrder
{
    Node mergeResult(Node node1, Node node2)
    {
	    Node p = node1,q = node2;
	    
	    //if any of node already null or both already null.
	    if(p==null && q==null){
	        return null;
	    }
	    if(p==null){
	        Node ans = reverseLinkedList(q);
	        return ans;
	    }
	    if(q==null){
	        Node ans = reverseLinkedList(p);
	        return ans;
	    }
	    
	    
	    //create a entire LinkedList using marge sort
	    Node temp ;
        if(p.data<q.data){
            temp = new Node(p.data);
            p = p.next;
        }else{
            temp = new Node(q.data);
            q = q.next;
        }
        
        Node start = temp; //pointer to point first position.
        //create LinkedList        
        create_LinkedList_Using_margeSort(p,q,temp);

	    //lets reverse it for the anser. 
	    Node ans = reverseLinkedList(start);
	    return ans;
	    
    }
    public void create_LinkedList_Using_margeSort(Node p,Node q,Node temp){
        while(p!=null && q!=null){
	        if(p.data<q.data){
	            temp.next = new Node(p.data);
	            temp = temp.next;
	            p = p.next;
	        }else{
	            temp.next = new Node(q.data);
	            temp = temp.next;
	            q = q.next;
	        }
	    }
	    while(p!=null){
	        temp.next = new Node(p.data);
	        temp = temp.next;
	        p = p.next;
	    }
	    while(q!=null){
	        temp.next = new Node(q.data);
	        temp = temp.next;
	        q = q.next;
	    }
    }
    
    public static Node reverseLinkedList(Node node){
        Node prev = node;
        Node after = prev.next;
        Node temp = after;
        
        prev.next = null;
        while(temp.next!=null){
            temp = after.next;
            after.next = prev;
            prev = after;
            after = temp;
        }
        temp.next = prev;
        return temp;
    }
}
