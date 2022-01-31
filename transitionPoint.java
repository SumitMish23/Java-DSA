public class transitionPoint {
    
    // {0,0,0,1,1};
    static int transitionFinder(int arr[], int n) {
        int start=0;
        int end=n-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(arr[start]==arr[end] && arr[start]==1){
                return 0;
            }
            if(arr[start]==arr[end] && arr[start]==0){
                return -1;
            }
            if(start==end){
                return mid;
            }
            if(arr[mid+1]>arr[mid]){
                return mid+1;
            }
            else if(arr[mid+1]==0){
                start=mid+1;
            }
            else if(arr[mid+1]==1){
                end=mid;
            }
            
        
        }
        
       return -1;
         
    }
    public static void main(String[] args){
        int arr[]={0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 ,0 ,0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1 ,1 ,1 ,1 ,1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 ,1, 1, 1, 1, 1};
        int n=arr.length;
        int transitionPoint=transitionFinder(arr, n);
        System.out.println("The Transition Point is "+ transitionPoint);


    }
 
    
}
