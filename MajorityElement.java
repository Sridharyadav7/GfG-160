class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int ele1=-1;
        int ele2=-1;
        int cnt1=0;
        int cnt2=0;
        for(int i=0;i<nums.length;i++){
            if(ele1==nums[i]){
                cnt1++;
            }
            else if(ele2==nums[i]){
                cnt2++;
            }
            else if(cnt1==0){
                ele1=nums[i];
                cnt1++;
            }
            else if(cnt2==0){
                ele2=nums[i];
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }
        cnt1=0;
        cnt2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==ele1){
                cnt1++;
            }
            if(nums[i]==ele2){
                cnt2++;
            }
        }
        if(cnt1>nums.length/3) ans.add(ele1);
        if(cnt2>nums.length/3 && ele2!=ele1) ans.add(ele2);
        
        Collections.sort(ans);
        return ans;
    }
}