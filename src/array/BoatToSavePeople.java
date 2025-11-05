package array;
import java.util.Arrays;

public class BoatToSavePeople {
    public static void main(String[] args) {
        int [] people ={3,5,3,4};
        int limit = 5;
        int boat =0;
        int st=0;
        int end=people.length-1;
        Arrays.sort(people);
        while(st<=end){
            boat++;
            if(people[st]+people[end]<=limit){
                st++;
            }
            end--;
        }
        System.out.println(boat);
    }
}
