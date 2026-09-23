class Solution {
    public String isAutomorphic(int n) {
      if (n == 0) return "Automorphic"; 

              long squ = (long) n * n;

              while (n > 0) {
                  if (n % 10 != squ % 10) {
                      return "Not Automorphic";
                  }
                  n = n / 10;
                  squ = squ / 10;
              }

              return "Automorphic"; 
    }
}