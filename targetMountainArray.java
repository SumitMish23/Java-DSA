public class targetMountainArray{
    public static void main(String[] args) {
    targetMountainArray t1=new targetMountainArray();
    int arr[]={3,4,5,6,7,0,1,2};
    int target=1;
    int start,end;
    start=0;
    end=arr.length-1;
    int TargetValue=t1.recurTarget(arr, target, start, end);
    System.out.println("The index of target element is "+TargetValue);
    
    }
    public int recurTarget(int arr[],int target,int start,int end){
        int mid=(start+end)/2;
        //System.out.println("The middle element is "+mid);
        if(target==arr[mid])
        {
            return mid;
        }
       else  if(target<arr[start] && target<arr[mid])
        {
            recurTarget(arr, target,mid, end);
        }
        else if(target>arr[start]  && target>arr[mid] ){
            recurTarget(arr, target,start, mid);
        }
         
        return 0;
    }
}