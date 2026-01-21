/*
 * code by Cayden Barnett 
 */

import java.util.Scanner;

public class InPersonLab {
   public static String[] calculateGrades(float[] a) {
      String[] letterGrades = new String[a.length];
      for (int i = 0; i < a.length; i++) {
         if (a[i] >= 90) {
            letterGrades[i] = "A";
         } else if (a[i] >= 80) {
            letterGrades[i] = "B";
         } else if (a[i] >= 70) {
            letterGrades[i] = "C";
         } else if (a[i] >= 60) {
            letterGrades[i] = "D";
         } else {
            letterGrades[i] = "F";
         }
      }
      return letterGrades;
   }

   public static void gradeDistribution(String[] j) {
      int a = 0;
      int b = 0;
      int c = 0;
      int d = 0;
      int f = 0;
      for (int i = 0; i < j.length; i++) {
         if (j[i].equals("A")){
            a++;
         } else if (j[i].equals("B")){
            b++;
         } else if (j[i].equals("C")){
            c++;
         } else if (j[i].equals("D")){
            d++;
         } else if (j[i].equals("F")){
            f++;
         }
      }
      System.out.println("A: " + a);
      System.out.println("B: " + b);
      System.out.println("C: " + c);
      System.out.println("D: " + d);
      System.out.println("F: " + f);

   }

   public static void main(String[] args) {
      Scanner k = new Scanner(System.in);
      System.out.println("please enter 10 grades:");
      float[] grades = new float[10];
      for (int i = 0; i < 10; i++) {
         grades[i] = k.nextFloat();
      }
      String[] letterGrades = calculateGrades(grades);
      gradeDistribution(letterGrades);
   }
}
