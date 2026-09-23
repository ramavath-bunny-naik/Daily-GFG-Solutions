class Solution {
    static boolean armstrongNumber(int n) {
      int temp=n;
      int ams=0;
      
      while(n>0){
          int d=n%10;
          ams=ams+(d*d*d);
          n=n/10;
      }
      return temp==ams;
    }
}