class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
    for(int i=0;i<n;i++){
        if(arr[i]>max){
            max = arr[i];
        }
    }    
    
    for(int i=0;i<n;i++){
        if(arr[i]<min){
            min = arr[i];
        }
    }
    
     ArrayList<Integer> result = new ArrayList<>();
        result.add(min);   
        result.add(max);   

        return result;    
    }
}
