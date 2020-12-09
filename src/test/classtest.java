package test;

import java.util.Scanner;

public class classtest {

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter the total size : ");
      int n= scanner.nextInt();
      int [] values = new int[n];
      int [] count = new int[9];
      int max = 0;
      System.out.println("Enter "+ n +" numbers between 1 to 9 :");
      for(int i=0;i<n;i++) {
          values[i] = scanner.nextInt();
          ++count[values[i]];
          if(count[values[i]] >max)
              max=count[values[i]];
      }
      histogram(max, count);

   }

   static void histogram(int max, int[] count) {
      for(int i=max;i>0;i--) {
          for(int j=0;j<9;j++) {
              if(count[j]>=i) {
                  System.out.print("* ");
              }else {
                  System.out.print("  ");
              }
          }
          System.out.println();
      }
      for(int i=0;i<=9;i++)
          System.out.print(i+" ");
    }
 }