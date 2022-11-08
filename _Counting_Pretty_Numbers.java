import java.util.*;
class TLK{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t > 0){
        int a = in.nextInt();
        int b = in.nextInt();
        int ans = 0;
        for(int i = a; i <= b; i++){
            if(pretty(i))ans++;
        }
        System.out.println(ans);
        t--;
        }
    }
    
    static boolean pretty(int n){
        return(n%10 == 2 || n%10 == 3 || n%10 == 9);
    }
}