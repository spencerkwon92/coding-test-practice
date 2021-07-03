import java.util.Arrays;
import java.util.HashSet;

/**
 * Suppose that you arrive at Dr. Hong's lab at the end of a long journey to catch ponketmon. Dr. Hong allows you to take "N"/2 ponketmons among "N" ponketmons in his lab.
 * Ponketmons in Dr. Hong's lab are identified by a number given based on its type. Therefore, ponketmons with the same type have the same number.
 * For example, if there are 4 ponketmons in the lab,
 * and the type number of each ponketmon is [number 3, number 1, number 2, number 3], this represents that there are two ponketmons of number 3, one ponketmon of number 1,
 * and one ponketmon of number 2. At this point, there are 6 ways to select two ponketmons among the four ponketmons as follows.
 * Selecting the first (number 3) and the second (number 1) ponketmons.
 * Selecting the first (number 3) and the third (number 2) ponketmons.
 * Selecting the first (number 3) and the fourth (number 3) ponketmons.
 * Selecting the second (number 1) and the third (number 2) ponketmons.
 * Selecting the second (number 1) and the fourth (number 3) ponketmons.
 * Selecting the third (number 2) and the fourth (number 3) ponketmons.
 * At this point, if you select the first (number 3) and the fourth (number 3) ponketmons, you will get only one type of ponketmon (two ponketmons of number 3).
 * However, you can get two types of ponketmons in the other methods. Therefore, in the example above, the maximum number of ponketmon types you can get is 2.
 * Since you want to get as many types of ponketmon as possible, you want to select "N"/2 ponketmons including as many types as possible. Given an array nums containing the type number
 * of "N" ponketmons as the parameter, write a function "solution" to find the way to select and return the maximum number of types you can get.
 */


public class Poketmon {
    public int solution(int[] nums) {
        int answer = 0;
        int howManySelect = nums.length/2;

        HashSet<Integer> hSet = new HashSet<>();
        for (int ele:nums) {
            hSet.add(ele);
        }

        int howManyTypes = hSet.size();

        if(howManyTypes > howManySelect){
            answer = howManySelect;
        }else if(howManyTypes < howManySelect){
            answer = howManyTypes;
        }else{
            answer = howManyTypes;
        }
        return answer;
    }


    public static void main(String[] argv){
        int[] arr = {2,1,2,3,4,5,5,6,6};
        Poketmon p = new Poketmon();

        int result = p.solution(arr);

        System.out.println(result);

    }

}
