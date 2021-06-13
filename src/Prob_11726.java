import java.util.Scanner;

public class Prob_11726 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[1001];
        arr[1] = 1;
        arr[2] = 2;

        for(int i=3; i<=n; i++){
            arr[i] = (arr[i-1] + arr[i-2])%10007;
        }

        System.out.println(arr[n]);
    }
}
