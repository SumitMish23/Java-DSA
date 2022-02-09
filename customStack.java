public class customStack {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;
   int ptr=-1;
   public customStack(){
       this(DEFAULT_SIZE);
   }
    public customStack(int size)
    {
        this.data=new int[size];
    }
    public  boolean push(int item){
        if(isFull()){
            System.out.println("is  full....");
            return false;
        }
        ptr++;
        data[ptr]=item;
        return true;
    }
    public  boolean Dynamicpush(int item){
        if(isFull()){
            int[] temp=new int[data.length*2];

            // Copy previous items
            for(int i=0;i<data.length;i++)
            {
                 temp[i]=data[i];
            }
            data=temp;
        }
        ptr++;
        data[ptr]=item;
        return true;
    }
    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("cannot pop from empty stack....");

        }
       
      return data[ptr--];
    }
    
    public int peek(){
        return data[ptr];
    }
    private boolean isFull(){
        return ptr==data.length-1;
    }
    private boolean isEmpty(){
        return ptr==-1;
    }
    public static void main(String args[]) throws Exception {
       customStack stack=new customStack(5);
        stack.Dynamicpush(12);
        stack.Dynamicpush(1);
        stack.Dynamicpush(23);
        stack.Dynamicpush(54);
        stack.Dynamicpush(230);
        stack.Dynamicpush(250);
        System.out.println(stack.pop()); 
        System.out.println(stack.pop()); 
        System.out.println(stack.pop()); 
        System.out.println(stack.pop()); 
        System.out.println(stack.pop()); 
      
    }
    
}
