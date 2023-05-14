/* Problem statement is in description
Given a string, remove spaces from it. 

Example 1:

Input:
S = "geeks  for geeks"
Output: geeksforgeeks
Explanation: All the spaces have been 
removed.
*/
 class Solution
{
   
    String modify(String S)
    {
        S=S.replace(" ","");
        return(S);
    }
}
