import java.util.ArrayList;
import java.util.Collections;

public class testing {
     static ArrayList<Integer> duplicates(int arr[], int n) {
        ArrayList<Integer> ar=new ArrayList<>();
        System.out.println(ar.toString());

         for(int i=0;i<n;i++)
         {
             for(int z=1;z<n;z++)
                {
                    if(i==z)
                    {
                        continue;
                    }
                    if(arr[i]==arr[z])
                       {
                           if(ar.contains(arr[z])){
                               continue;
                           }
                           else{
                           ar.add( arr[z]);
                           }
                       }
                }
         }
         if(ar.isEmpty()){
           System.out.println("-1");
           }
           Collections.sort(ar);
          
          return ar;
         
    }
    public static void main(String args[]) {
          // Declaring the ArrayList with
        // initial size n
        int[] arr={2,3,1,2,3};
        System.out.println(duplicates(arr, arr.length));
     }
}
