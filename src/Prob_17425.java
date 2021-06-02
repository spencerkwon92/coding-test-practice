import java.util.Arrays;
import java.util.Scanner;

public class Prob_17425 {

    Prob_17425() {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int GX=0;
        int[] arr = new int[num];
        for(int i=0; i<num; i++){
            int ele = scan.nextInt();
            arr[i]= ele;
        }

        for(int i=0; i<num; i++){
            for(int j=1; j<=arr[i]; j++){
                GX += Div_sum(j);
            }
            System.out.println(GX);
            GX = 0;
        }
    }

    public static int Div_sum(int N){

        int sum = 0;
        int result = 0;
        for(int i=1; i<=N ; i++){
            if(N%i==0){
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] argv){
        new Prob_17425();
    }
}
