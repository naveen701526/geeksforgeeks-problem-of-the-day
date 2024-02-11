class RecamansSequence{
    static ArrayList<Integer> recamanSequence(int n){
        // code here
        Set<Integer> s=new HashSet<>();
        ArrayList<Integer> l=new ArrayList<>();
        l.add(0);
        s.add(0);
        for(int i=1;i<n;i++){
            int a=l.get(i-1)-i;
            if(a>0 && !s.contains(a)){
                l.add(a);
                s.add(a);
            }
            else{
                a=l.get(i-1)+i;
                l.add(a);
                s.add(a);
            }
        }
        return l;
    }
}

