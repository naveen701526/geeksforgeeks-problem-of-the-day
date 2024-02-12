class RecurisveSequence{
    static  int d=1000000007;
    static long cal(int i, int lastdigit){
        long ans=1;
     for(int j=lastdigit;j>=(lastdigit-i+1);j--){
         ans=ans*j;
         ans=ans%d;
     }
     return ans;
    }
    static long sequence(int n){
      long fans=0;
      for(int i=1;i<=n;i++){
          int lasdigit=((i*(i+1))/2);
          fans+=cal(i,lasdigit);
          
      }
      return fans%d;
    }
}
