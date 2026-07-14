package Input;
import java.util.*;
public class input1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line=sc.nextLine();
        // String[] parts=line.split(" "); // for input like 1 2 3 4
        String[] parts=line.split(","); // for input like 1,2,3,4
        int[] arr=new int[parts.length];
        for(int i=0;i<parts.length;i++){
            arr[i]=Integer.parseInt(parts[i]);

        }
        
    }
}