class Solution {
    private static int[] fibseries;
    public int fib(int n) {
        fibseries = new int[n+1];
        return fibHelper(n);
    }
    public static int fibHelper(int n){
        if(n<=1){
            return n;
        }
        if(fibseries[n]!=0){
            return fibseries[n];
        }
        fibseries[n]= (fibHelper(n-1)+fibHelper(n-2));
        return fibseries[n];
    }
}