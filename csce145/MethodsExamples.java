public class MethodsExamples{
   public static void print(String a){
      System.out.println(a);
   }
   public void printArray(int[] a){
      for(int i=0;i<a.length;i++){
         print(a[i] + "");
      }
   }
   public static void main(String[] args) {
      print("hello world");
      MethodsExamples arraysp = new MethodsExamples();
      int[] array1 = {1, 2, 3};
      int[] array2 = {4, 5, 6, 7};
      arraysp.printArray(array1);
      arraysp.printArray(array2);
   }
}
