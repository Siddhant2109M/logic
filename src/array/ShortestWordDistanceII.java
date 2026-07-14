package array;
class ShortestWordDistanceII{
    public static void main(String[] args) {
        String wordsDict[] = {"quia", "blanditiis", "dolores", "sed", "tenetur", "eos", "unde", "tenetur", "blanditiis", "ducimus" };
        String word1 = "tenetur", word2 = "blanditiis";
        int arr1[] = new int[wordsDict.length];
        int arr2[] = new int[wordsDict.length];
        int k=0,l=0;
        for(int i=0;i<wordsDict.length;i++){
            if(wordsDict[i].equals(word1)){
                arr1[k++]=i;
            }
            if(wordsDict[i].equals(word2)){
                arr2[l++]=i;
            }
        }
        int min = Integer.MAX_VALUE;    
        if(k>l){
            for(int i=0;i<l;i++){
                for(int j=0;j<k;j++){
                   min = Math.min(min, Math.abs(arr1[j]-arr2[i]));
                }
            }
        }
        else{
            for(int i=0;i<k;i++){
                for(int j=0;j<l;j++){
                     min = Math.min(min, Math.abs(arr1[i]-arr2[j]));
                }
            }
        }
        System.out.println(min);


    }
}