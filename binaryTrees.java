public class binaryTrees {
       
      public  void showtreein(binaryTrees t){
          if(t==null)
          {
              return;
          }
          else{
             System.out.println(" "+t.val);
             System.out.println("/");
             showtreein(t.left);
          }
      }
  
        int val;
        binaryTrees left;
        binaryTrees right;
        binaryTrees(int value){
            this.val=value;
           
        
    }
    public static void main(String args[]) {
        binaryTrees bt=new binaryTrees(4);
        bt.left=new binaryTrees(100);
        bt.left.left=new binaryTrees(300);
        bt.right=new binaryTrees(200);
        
       bt.showtreein(bt);
        
       

    }
}
