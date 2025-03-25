class Solution {
    void nextPermutation(int[] arr) {
        int ind=-1;
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                ind=i;
                break;
            }
        }
        
        if(ind==-1){
            reverse(arr,0,arr.length-1);
            return;
        }
        
        for(int i=arr.length-1;i>ind;i--){
            if(arr[i]>arr[ind]){
                int temp=arr[ind];
                arr[ind]=arr[i];
                arr[i]=temp;
                break;
            }
        }
        
        reverse(arr,ind+1,arr.length-1);
    }
    
    public void reverse(int[] arr, int start, int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}