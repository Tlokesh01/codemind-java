import java.util.*;
class VAMPIRE{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        for(int i = 0; i < n; i++){
            int x = in.nextInt();
            sum += x;
        }
        System.out.println(sum);
    }
}