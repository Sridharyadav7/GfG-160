class Solution {
    public void reverseArray(int arr[]) {
        if(arr.length==1 || arr.length==0) return;
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}