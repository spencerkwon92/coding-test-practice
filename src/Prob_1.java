import java.text.SimpleDateFormat;
import java.util.*;



public class Prob_1 {
    public String solution_sub(String s){

        String result = "NO FILES";

        String[] datum = s.split(" ");
        int fileSize = Integer.valueOf(datum[0]);
        int date = Integer.valueOf(datum[1]);
        int month = monthTranfer(datum[2]);
        int year = Integer.valueOf(datum[3]);
        String fileName = datum[4];

        if(fileSize >= 245760){
            if(year>1990){
                if(month>1){
                    result = "FIND";
                }
            }
        }

        return result;
    }

    public int solution(String s){
        String[] datum = s.split("\n");
        ArrayList<String> arr = new ArrayList<>();
        int result = 0;

        for(String ele:datum){
            String str = solution_sub(ele);
            if(str.equals("FIND")){
                result++;
            }
        }

        return result;
    }
    public int monthTranfer(String m){
        String[] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun","Jul",
                "Aug", "Sep", "Oct", "Nov", "Dec"};
        int result = 0;
        for (int i=0;i<month.length;i++){
            if(m.equals(month[i])){
                result = i+1;
            }
        }

        return result;

    }
    public static void main(String[] argv){
        Prob_1 c = new Prob_1();

        String S = "779091968 23 Sep 2009 system.zip\n" +
                "284164096 14 Aug 2013 to-do-list.xml\n" +
                "714080256 19 Jun 2013 blockbuster.mpeg\n" +
                "329 12 Dec 2010 notes.html\n" +
                "444596224 17 Jan 1950 delete-this.zip\n" +
                "641 24 May 1987 setup.png\n" +
                "245760 16 Jul 2005 archive.zip\n" +
                "839909376 31 Jan 1990 library.dll";

        int anw = c.solution(S);
        System.out.println(anw);
    }
}
