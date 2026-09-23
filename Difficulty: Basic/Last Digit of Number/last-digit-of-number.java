import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
if(n<0){
    int d = n%10;
    System.out.println(d*-1);
}else{
       int d = n%10;
    System.out.println(d);
}
        
    }
}