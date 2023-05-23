/*
problem link is in description
Find the missing element from an ordered array arr[], consisting of N elements representing an Arithmetic Progression(AP).

Note: There always exists an element which upon inserting into sequence forms Arithmetic progression. Boundary elements (first and last elements) are not missing.

Example 1:

Input:
N = 6
Arr[] = {2, 4, 8, 10, 12, 14}
Output: 6
Explanation: Actual AP should be 
2, 4, 6, 8, 10, 12, 14.
Solve less test cases work to find optimised solution


*/

class Solution {
    int findMissing(int[] arr, int n) {
        n=arr.length;
        int sum=0;
        int x=0;
         
    for(int i=0;i<n;i++)
    {
        sum=((n+1)*(arr[0]+arr[n-1]))/2;
        x+=arr[i];
        }
       return sum-x;
      
    }
}
