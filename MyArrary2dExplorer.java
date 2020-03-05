public class MyArray2DExplorer{
  public static void main(String[] args) {
       int array [][] = {  {4,1,8,5},
                           {0,2,3,4},
                           {6,6,2,2} };
       MyArray2DExplorer exp = new MyArray2DExplorer();

       System.out.println("Test evenRow: \n Row w/ odd, Expecting: false \n Actual: " + exp.evenRow(array,0));
       System.out.println("Test evenRow: \n Row w/o odd, Expecting: true \n Actual: " + exp.evenRow(array,2));

       System.out.println();

       System.out.println("Test oddColSum: \n Col w/ odd Sum, Expecting: true \n Actual: " + exp.oddColSum(array,1));
       System.out.println("Test oddColSum: \n Col w/ even, Expecting: false \n Actual: " + exp.oddColSum(array,0));

       System.out.println();


       System.out.print("Test minRow: \n Expecting: {0 2 3 4} \n Actual: {");
       int [] row = exp.minRow(array);
       for(int i = 0; i < row.length; i++){
           System.out.print(row[i] + " ");
       }
       System.out.print("]");
       System.our.println();
       Ststrem.out.println("test minRowAssignment: \n Expecting: 2 \n Actaul:")

   }
   public int[] minRow(int[][] nums, int row){
     int row =0;
     for(int [] row: nums){
       for(int n: row){
         if(n < min )
         min= n;
       }
     }
   }
   public int[] colMaxs(int[][]matrix){
     max=0;
     for(int [] : max){
       for(int n : max)
       if(int n > max)
       return max;
     }
   }
   }

public int[] allRowSums(int[][] data){
int row =0;
int [] row = exp.allRowSums(array);
for(int i = 0; i < row.length; i++){
  return i;
  }
}




   public boolean evenRow(int [][] mat, int row){
     for(int n : mat){
       if(n % 2 = 0){
         return true;
       }
       else
       return false;
     }

   }
   public int[] smallEven(int [][] mat){
int small=1
     int [] row = exp.smallEven(array);
     for(int i = 0; i < row.length; i++){
       for(int i : mat){
         if(i % 2 = 0 && i< small;)
            return 1
            }
          }
        }
      public boolean biggestRow(int [][] mat, int row){
        int biggestRow= 0
        int rowSum1= 0
        int Rowsum2= 0
      for(int [] row: nums){
        for(int n : rowSum1)
        return n;

      }
      for(int [] row: nums){
        for(int n : rowSum2)
        return n;
 }



}
