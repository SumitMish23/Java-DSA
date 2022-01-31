class binarySearchh {
    public static void main(String[] args) {

        int arr[] = { 2, 3, 4, 5, 81, 98, 99 ,102,105};
        int start, end;
        int element = 5;
        start = 0;
        end = arr.length - 1;
        int Value = bs(arr, start, end, element);
        System.out.println("The index of the element is " + Value);

    }

   static int bs(int arr[],int low,int high,int k)
    {
        while(low<=high)
    {
        int mid=(low+high)/2;
        
       if(arr[mid]==k)
       {
           return mid;
       }
       if(arr[mid]>k)
       {
          return bs(arr,low,mid-1,k);
       }
       else if(arr[mid]<k)
       {
           return bs(arr,mid+1,high,k);
       }
        
    }
        return-1;
    }
}

