import java.util.Scanner;
public class TempStats {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int count, countBig=0;
    double sum=0, average;
    System.out.println("How many temperatures do you have to enter? ");
    count=in.nextInt();
    double temps [] = new double[count];
    for (int i=0; i<count; i++) {
      int j=i+1;
      System.out.println("Enter temp #" + j +": ");
      temps[i]=in.nextDouble();
      sum=sum+temps[i];
    }
    average = sum/count;
    System.out.println("\nThe average temp is: " + average);
    for (int i=0; i<count; i++) {
      if (temps[i]>average) {
        countBig++;
      }
      System.out.println("There are " +countBig+ " temps larger than the average.");
   }
}