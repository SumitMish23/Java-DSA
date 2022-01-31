public class penaltyShootout {
   static public int penaltyScore(String S)
    {
        int c=0;
	    for(int i=0;i<S.length();i++)
	    {
	       if(S.charAt(i)=='2')
	       {
	          while(S.charAt(i)=='2')
	       }
	    }
	  return c;
    }
    public static void main(String args[]){
        String Sem = "1012012112110";
        System.out.println("the penalty count is "+  penaltyScore(Sem));
    
    }
    
}
