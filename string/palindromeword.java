/*
Input: S = "welcome to geeksforgeeks"
Output: wlcm t gksfrgks
Explanation: Ignore vowels and print other
characters */
class Solution {
    int isPalindrome(String S) {
        
        String b="";
        
        for(int i=S.length()-1;i>=0;i--)
        {
            b=b+S.charAt(i);
            
        }
        
        if(S.equals(b))
       { return 1;
        }
        else{
            return -1;
        }
        
    }
    }
