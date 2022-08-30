import java.math.BigInteger;

public class Unique_Paths_62 {
    
    public static void main(String args[]) {
        //System.out.println(uniquePaths(6,4));
        //System.out.println(uniquePaths(12,12));
        System.out.println(uniquePaths(20,20));
    }


    public static int uniquePaths(int m, int n) {
        if(m == 1 && n == 1){
            return 1;
        }

        int lengthOfUpperSide = (n+m)-2;
        BigInteger upperValue = new BigInteger("1");
        BigInteger lower1stValue = new BigInteger("1");
        BigInteger lower2ndValue = new BigInteger("1");

        for(int i=2; i<=lengthOfUpperSide; i++){
            upperValue = upperValue.multiply(BigInteger.valueOf(i));
            if(i<=n-1)
                lower1stValue = lower1stValue.multiply(BigInteger.valueOf(i));
            if(i<=m-1)
                lower2ndValue = lower2ndValue.multiply(BigInteger.valueOf(i));
        }
        
        return (upperValue.divide(lower1stValue.multiply(lower2ndValue))).intValue();
    }

    public static BigInteger factorial(int num){
        double pi = Math.PI, e = Math.exp(1);
        return BigInteger.valueOf((long)((Math.sqrt((2*pi*num)))*Math.pow((num/e), num)));
    }
}
