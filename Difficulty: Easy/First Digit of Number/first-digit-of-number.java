class Solution {
    public static int firstDigit(int n) {
        int temp=n;
        int count=-1;
        while(n>0){
            count++;
            n=n/10;
        }
        int pow=1;
        for(int i=0;i<count;i++){
            pow=pow*10;
        }
        int d=temp/pow;
        return d;
        
    }
}