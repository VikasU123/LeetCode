class Solution {
    public int tribonacci(int n) {
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else if(n==2){
            return 1;
        }
        return findAns(0, 1, 1, n, 3);
        
    }
    
    public int findAns(int t1, int t2, int t3, int n, int r){
        int t4=t1+t2+t3;
        if(n==r){
            return t4;
        }
        return findAns(t2, t3, t4, n, r+1);
    }
}