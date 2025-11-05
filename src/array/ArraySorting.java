package array;

public class ArraySorting {
    public static void main(String[] args) {
        int [] arr={0,0,1,0,1,1,1,0,0};
        //Arrays.sort(arr);
        int start=0;
        int end=arr.length-1;
        while(start<end){
            if(arr[start]==0){
                start++;
            }
            else{
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                end--;
            }
        }
        for(int wl:arr){
            System.out.print(wl+" ");
        }

    }
}
