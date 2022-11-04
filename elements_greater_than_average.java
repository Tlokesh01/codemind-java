import java.util.*;

class VAMPIRE{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
            sum += arr[i];
        }
        // double avg = (double)(sum)/(double)(n);
        int avg = sum/n;
        int ans = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] >= avg)ans++;
        }
        System.out.println(ans);
    }
}