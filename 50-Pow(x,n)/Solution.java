public class Solution {
    public double myPow(double x, int n) {
        if(n == 0) return 1;
        if(n < 0){
            x = 1 / x;
            return myPow(x * x, -(n / 2)) * ((n % 2 == 0) ? 1 : x);
        } else {
            return myPow(x * x, n / 2) * ((n % 2 == 0) ? 1 : x);
        }
    }
}
