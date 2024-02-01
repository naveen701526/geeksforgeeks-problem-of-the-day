class PanagramChecking
{
    //Function to check if a string is Pangram or not.
    public static boolean checkPangram  (String s) {
        int CHAR=26;
        int count[]=new int[CHAR];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z'){
                count[ch-'a']++;
            }
            else if(ch>='A'&& ch<='Z'){
                count[ch-'A']++;
            }
        }
        for(int i=0;i<CHAR;i++)
        {
            if(count[i]==0){
                return false;
            }
        }
        return true;
    }
}
