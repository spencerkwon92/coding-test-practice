import java.util.Scanner;

public class Prob_10430 {

    Prob_10430(){
        Scanner scan = new Scanner(System.in);
        String data = scan.nextLine();

        String[] arr = data.split(" ");
        int A = Integer.valueOf(arr[0]);
        int B = Integer.valueOf(arr[1]);
        int C = Integer.valueOf(arr[2]);

        System.out.println((A+B)%C);
        System.out.println(((A%C) + (B%C))%C);
        System.out.println((A*B)%C);
        System.out.println(((A%C) * (B%C))%C);
    }

    public static void main(String[] argv){
        new Prob_10430();
    }
}
