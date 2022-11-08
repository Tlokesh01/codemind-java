import java.util.*;
class TLK{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(prime(n,2))n++;
        while(!prime(n,2))n = npal(n);
        System.out.println(n);
        
        
    }
    
    static boolean prime(int n, int i){
        if(n<2)return false;
        if(i*i > n)return true;
        if(n%i == 0)return false;
        return prime(n,i+1);
    }
    
    static boolean pal(int n){
        int i = 0;
        int n1 = n;
        while(n > 0){
            int r = n%10;
            i = i*10+r;
            n = n/10;
        }
        return n1 == i;
    }
    
    static int npal(int n){
        if(pal(n))n++;
        while(!pal(n))n++;
        return n;
    }
}