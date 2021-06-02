
import java.util.Scanner;

public class Prob_17427 {

    Prob_17427(){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int GX = 0;
        for(int i=1; i<=N; i++){
            GX += Div_sum(i);
        }
        System.out.println(GX);
    }

    public static int Div_sum(int N){

        int result = 0;
        for(int i=1; i<=N ; i++){
            if(N%i==0){
                result += i;
            }
        }
        return result;
    }


    public static void main (String[] argv){
        new Prob_17427();
    }

}
