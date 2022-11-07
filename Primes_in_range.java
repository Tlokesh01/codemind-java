import java.util.*;
class VAMPIRE{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int ans = 0;
        for(int i = a; i <= b; i++){
            if(prime(i,2))ans++;
        }
        System.out.println(ans);
    }
    
    static boolean prime(int n, int i){
        if(n < 2)return false;
        if(i*i > n)return true;
        if(n%i == 0)return false;
        return prime(n,i+1);
    }
}