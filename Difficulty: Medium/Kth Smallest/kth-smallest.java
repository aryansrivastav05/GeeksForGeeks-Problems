class Solution {
    public int kthSmallest(int[] arr, int k) {
       PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        int n = arr.length;
        for(int i=0;i<n;i++){
            maxHeap.add(arr[i]);
            
            if(maxHeap.size()>k){
                maxHeap.poll();
            }
        }
        return maxHeap.peek();
    }
}
