class LongestSubArraySumDivisibleByK{
    int longSubarrWthSumDivByK(int a[], int n, int k)
    {
        // Complete the function
        int ans=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        
        int sum=0;
        int rem=0;
        map.put(0,-1);
        
        for(int i=0;i<n;i++){
            sum+= a[i];
            rem=sum%k;
            
            if(rem<0) rem +=k;
            
            if(map.containsKey(rem)){
                int idx = map.get(rem);
                int len =i-idx;
                if(len>ans) ans=len; 
            }
            else map.put(rem,i);
        }
        
       return ans;
    }
 
}
