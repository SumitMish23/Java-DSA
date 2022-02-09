public class removeDuplicates {


    public static int removeDuplicates(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int m=0;m<nums.length-1;m++)
            {
                if(nums[i]==nums[m])
                {
                    c++;
                    int n=0;
                   
                        nums[m]=nums[m+1];
                        n++;
                    
                    
                }
            }
        }
        return c;
    }
    public static void main(String args[])
    {
        int[] arr={1,1,2,2,3,3,3,34,45};
        System.out.println("The Sorted Array is "+removeDuplicates(arr));

    }
}
