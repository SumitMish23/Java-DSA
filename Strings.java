public class Strings{

    static boolean isBinary(String str)
	
	{
 	    for(int i=0;i<str.length();i++){
	        if(str.charAt(i)!='1' && str.charAt(i)!='0'){
 	            return false;
	        }
	    }
	  return true;
	}
    public static void main(String[] args) {
      String num="11110";
      System.out.println(isBinary(num));

        
    }

}