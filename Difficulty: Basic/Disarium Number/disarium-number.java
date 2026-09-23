class Solution {
    public boolean isDisarium(int n) {
        int temp=n;
        int temp1=n;int count=0;
        while(n>0){
            count++;
            n=n/10;
        }int sum=0;
        while(temp>0){
            int d=temp%10;
             sum=(int)(sum+Math.pow(d,count));
             count--;
               temp=temp/10;
        }
        return temp1==sum;
    }
}