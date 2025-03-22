class Solution {
    void pushZerosToEnd(int[] arr) {
        int i=0;
        int j=1;
        while(j<arr.length){
            if(arr[i]==0){
                if(arr[j]!=0){
                    arr[i]=arr[j];
                    arr[j]=0;
                    i++;
                    j++;
                }
                else{
                    j++;
                }
            }
            else{
                i++;
                j++;
            }
        }
    }
}