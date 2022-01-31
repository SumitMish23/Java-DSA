public class happyNumber {

    public static boolean isHappy(double n) {
        double ans=0;
            while(n>0)
            {
                if(ans!=1){
                ans=ans+(int)Math.pow(n%10,2);
                n=n/10;
                }
                
                if(ans==1)
                {
                    return true;
                }
                n=ans;
            }
        return false;
        
    }
    public static void main(String[] args)
    {
           int A=19;
           System.out.println(isHappy(A));
    }
    
}
