//왕비를 피해 일곱 난쟁이들과 함께 평화롭게 생활하고 있던 백설공주에게 위기가 찾아왔다. 일과를 마치고 돌아온 난쟁이가 일곱 명이 아닌 아홉 명이었던 것이다.
//아홉 명의 난쟁이는 모두 자신이 "백설 공주와 일곱 난쟁이"의 주인공이라고 주장했다. 뛰어난 수학적 직관력을 가지고 있던 백설공주는, 다행스럽게도 일곱 난쟁이의 키의 합이 100이 됨을 기억해 냈다.
//아홉 난쟁이의 키가 주어졌을 때, 백설공주를 도와 일곱 난쟁이를 찾는 프로그램을 작성하시오.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Prob_2309 {

//    Prob_2309() throws IOException {
//
////        Scanner scan = new Scanner(System.in);
////        ArrayList<Integer> arr = new ArrayList<>(); //난쟁이 후보들을 담을 어레이 리스트
////
////        for(int i=0; i<9; i++){
////            int ele = scan.nextInt();
////            arr.add(ele);
////        }
////
////        for (int ele: filter(arr)){
////            System.out.println(ele);
////        }
//
//    }

    public static HashSet<Integer> filter (ArrayList<Integer> datum){
        HashSet<Integer> arr2 = new HashSet(); //선택된 8명의 난쟁이 후보들들을 저장함.
        for(int i=0; i<7; i++) {
            int index = (int) (Math.random() * 8);
            arr2.add(datum.get(index));
        }

        if(arr2.size()==7){
            if(arraySum(arr2)==100){
                return arr2;
            }else{
                filter(datum);
            }
        }else{
            filter(datum);
        }
        return null;
    }

    public static int arraySum(HashSet<Integer> datum){
        int result = 0;
        for (int ele:datum){
            result += ele;
        }

        return result;
    }
    public static void main(String[] argv) throws IOException {
//        new Prob_2309(); //데이터 읽는거는 항상
    }
}
