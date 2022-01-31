public class find1substring {
   static public int count(String s) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                count++;

            }
            if (s.charAt(i) == '0') {
                if (count > max) {

                    max = count;
                }
                 count = 0;
             }

        }
        
        return max;
    }

    public static void main(String args[]) {
        String s="1011";
        System.out.println("The number of times 1 is repeated longest in this string is "+ count(s));
    }
}
