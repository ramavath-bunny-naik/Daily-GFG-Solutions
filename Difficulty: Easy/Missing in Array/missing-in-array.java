class Solution {
    int missingNum(int arr[]) {
 
    int n=arr.length+1;
    int xor=0, xor1=0;
    for(int i=1;i<=n;i++){
        xor^=i;
    }
     for(int i=0;i<n-1;i++){
        xor1^=arr[i];
    }
        return xor^xor1;
    }
}
    