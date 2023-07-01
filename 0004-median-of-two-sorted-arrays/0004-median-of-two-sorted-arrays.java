class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=0;
        int m=0;
        int[] newarr = new int[nums1.length+nums2.length];
        int i=0;
        while(nums1.length>n && nums2.length>m){
            if(nums1[n]>nums2[m]){
                newarr[i]=nums2[m];
                i++;
                m++;
            }else{
                newarr[i]=nums1[n];
                i++;
                n++;
            }
        }
        while(nums1.length>n){
            newarr[i]=nums1[n];
            i++;
            n++;
        }
        while(nums2.length>m){
            newarr[i]=nums2[m];
            i++;
            m++;
        }
        int len = newarr.length;
        double ans=0.0;
        if(len%2==0){
            ans=((double)newarr[(len/2)-1]+(double)newarr[(len/2)])/2.0;
        }else{
            ans=newarr[len/2];
        }
        return ans;
    }
}