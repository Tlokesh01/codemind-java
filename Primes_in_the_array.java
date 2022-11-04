import java.util.*;
class VAMPIRE{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c = 0;
        for(int i = 0; i < n; i++){
            int x = in.nextInt();
            if(prime(x,2))c++;
            
        }
        System.out.println(c);
    }
    
    static boolean prime(int n,int i){
        if(n < 2)return false;
        if(i*i > n)return true;
        if(n%i == 0)return false;
        return prime(n,i+1);
        
    }
}