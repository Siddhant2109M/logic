package Input;

import java.util.Scanner;

public class input2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String line =sc.nextLine().trim();
        line=line.replaceAll("\\[|\\]", "");
        String[] parts=line.split(","); 
        int[] arr=new int[parts.length];
        for(int i=0;i<parts.length;i++){
            arr[i]=Integer.parseInt(parts[i]);

        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
