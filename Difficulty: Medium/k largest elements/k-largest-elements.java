class Solution {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
        PriorityQueue<Integer>pq = new PriorityQueue<>();
        int n = arr.length;
        for(int i=0;i<n;i++){
            pq.add(arr[i]);
            
            if(pq.size()>k){
                pq.poll();
            }
        }
        
        ArrayList<Integer>result = new ArrayList<>();
        while(!pq.isEmpty()){
            
            result.add(pq.poll());
        }
        Collections.sort(result, Collections.reverseOrder());

        return result;
        
    }
}
