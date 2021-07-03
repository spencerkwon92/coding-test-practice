import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public Solution(){}

    //S->name separated by , / C -> name of company.
    public String solution (String s, String c){
        String email = "";
        String[] temp = s.split(" ");
        for(int i=0; i<temp.length; i++){
            String str = temp[i];
            String newEle = str.toLowerCase().replaceAll("-","");
            temp[i] = newEle;
        }

        if(temp.length == 2){
            email = "<" + temp[0] + "." + temp[1] + c + ">";
        }else{
            email = "<" + temp[0] + "." + temp[2] + c + ">";
        }

        return email;

    }


    public static void main(String[] args){
        Solution sol = new Solution();

        String data = "John Doe, Peter Benjamin Parker, Mary Jane Watson-Parker, John Elvis Doe, John Evan Doe, Jane Doe, Peter Brian Parker";
        String[] arr = data.split(",");

        for(int i=1; i< arr.length; i++){
            String temp = arr[i];
            String newEle = temp.replaceFirst("\\s","");
            arr[i] = newEle;
        }

        for(int i=0; i<arr.length; i++){

            for(int j = i+1; j<arr.length; j++){
                if(arr[i].equals(arr[j])){
                    String result = sol.solution(arr[i]+2,"@example.com");
                    System.out.print(arr[i] + " "+ result + ", ");
                }

            }
            String result = sol.solution(arr[i],"@example.com");
            System.out.print(arr[i] + " "+ result + ", ");

        }


    }
}
