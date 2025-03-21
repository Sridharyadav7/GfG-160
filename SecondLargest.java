class Solution {
    public int getSecondLargest(int[] arr) {
        if(arr.length==0) return -1;
        if(arr.length==1) return arr[0];
        int max=arr[0];
        int max2=Integer.MIN_VALUE;
        int i=1;
        while(i<arr.length){
            if(arr[i]>max){
                max2=max;
                max=arr[i];
            }
            else if(arr[i]<max && arr[i]>max2){
                max2=arr[i];
            }
            i++;
        }
        if(max2==Integer.MIN_VALUE) return -1;
        return max2;
    }
}