package Basic;
public class SumOfTwoInputinArray {
    public static void main(String[] args) {
        int [] numbers ={2,7,11,15};
        int target = 9;
        int res[]=(so(numbers,target));
        for(int wl:res){
            System.out.print(wl+" ");
        }
    }
    public static int[] so(int [] numbers, int target) {


        int st = 0;
        int end = numbers.length-1;
        while(st<end){
            int sum = numbers[st]+numbers[end];
            if(sum==target){
                return new int[]{st+1,end+1};
            }
            else if(sum<target){
                st++;
            }
            else{
                end--;
            }
        }
      return new int[]{-1,1} ;
    }
}
