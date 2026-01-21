public class Arrays2D {
   public static void main(String[] args) {
      // 1D array of size 5
      int[] oneDimArray = new int[5];
      System.out.println(oneDimArray.length);
      oneDimArray[2] = 30;

      //2D arrays
      int[][] twoDimArray = new int[2][3];

      for(int i = 0; i < twoDimArray.length; i++){
         for(int j = 0; j < twoDimArray[i].length; j++){
            twoDimArray[i][j] = i + j;
         }
      }
      for(int a = 0; a < twoDimArray.length; a++){
         for(int b = 0; b < twoDimArray[a].length; b++){
            System.out.print(twoDimArray[a][b]);
         }
         System.out.print("\n");
      }
   }
}
