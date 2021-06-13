import java.util.*;

public class Prob_2309 {

    public static void main(String[] argv) {
        Scanner scan = new Scanner(System.in);
        int size = 9;
        int max = 100;
        ArrayList<Integer> arr = new ArrayList<>();
        int[] arr2 = new int[2];
        int sum = 0;
        for(int i=0; i<size; i++){
            arr.add(scan.nextInt());
        }
        for(int i=0; i<size; i++){sum += arr.get(i);}
        for(int i=0; i<size; i++){
            for(int j = i+1; j<size; j++){
                if(sum-(arr.get(i)+arr.get(j)) == max){
                    arr2[0] = arr.get(i);
                    arr2[1] = arr.get(j);
                    break;
                }
            }
        }
        Collections.sort(arr);

        for(int ele:arr) {
            if (ele != arr2[0] && ele != arr2[1]) {
                System.out.println(ele);
            }
        }
    }
}
