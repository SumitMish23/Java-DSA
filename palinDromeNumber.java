public class palinDromeNumber {


    public static boolean isPalindrome(int x) {
        String value=Integer.toString(x);
        int number=0;
         String s="";
        for(int i=0;i<value.length();i++)
        {
            number=x%10;
            s+=Integer.toString(number);
            x=x/10;
            
        }
        
        if(value.equals(anObject))
        {
           return true;
        }
        else{
            System.out.println(value);
            System.out.println(s);
            
           
          return false;
        }
    }
public static void main(String args[])
{
    int Number=121;
    System.out.println(isPalindrome(Number));
}
}