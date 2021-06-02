import java.util.Arrays;
import java.util.Scanner;

public class Prob_1037 {
    Prob_1037(){
        Scanner scan = new Scanner(System.in);
        int num = Integer.valueOf(scan.nextLine());
        int[] arr = new int[num];

        for(int i=0; i<num; i++){
            arr[i] = scan.nextInt();
        }

        Arrays.sort(arr);
        System.out.println(arr[0]*arr[num-1]);

    }

    public static void main (String[] argv){
       new Prob_1037();
    }
}
