class Solution {
    public int maxChunksToSorted(int[] arr) {
        
        int[] max = new int[arr.length+1];
       
       
        max[arr.length]=Integer.MAX_VALUE;
       
       
       
           for(int i=arr.length-1 ;i>=0;i--){
          
            max[i]=Math.min(max[i+1],arr[i]);
        }
        
        int left=Integer.MIN_VALUE, count=0;
       
        for(int i=0; i<arr.length; i++){
           
            left=Math.max(left,arr[i]);
           
            if(left<=max[i+1]){
                
                count++;
            }
        }
        
        return count;
    }
}