class Solution {
    int getMinDiff(int[] arr, int k) {
        Arrays.sort(arr);
        int n=arr.length;
        int minimum=arr[n-1]-arr[0];
        int smallest, largest;
        for(int i=1;i<n;i++){
            if(arr[i]-k<0){
                continue;
            }
            smallest=Math.min(arr[0]+k,arr[i]-k);
            largest=Math.max(arr[n-1]-k,arr[i-1]+k);
            minimum=Math.min(minimum, largest-smallest);
        }
        return minimum;
    }
}