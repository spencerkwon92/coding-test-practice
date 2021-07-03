

public class PEclass {



    public int solution(int n, int[] lost, int[] reserve) {
        int[] students = new int[n];
        for(int i:reserve){
            students[i-1]++;
        }

        for(int i:lost){
            students[i-1]--;
        }

        for(int i=0; i<students.length; i++){
                if(i != students.length-1 && students[i+1]>0){
                    students[i]++;
                    students[i+1]--;
                } else if(i !=0 && students[i-1] >0){
                    students[i]++;
                    students[i-1]--;
                }
            }
        }

        int answer = 0;

        for(int i=0; i<students.length; i++){
            if(students[i]>=0){
                answer++;
            }

        }
        return answer;
    }

    public static void main(String[] argv){
        int n = 5;
        int[] lost = {2,4};
        int[] reserve = {1,3,5};

        PEclass p = new PEclass();
        int result = p.solution(n,lost,reserve);
        System.out.println(result);
    }
}
