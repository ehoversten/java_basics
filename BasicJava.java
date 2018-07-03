import java.util.Arrays;
import java.util.ArrayList;

public class BasicJava {

  // 1) Print 1-255
  public static void print1to255() {
    for(int i = 0; i < 256; i++) {
      System.out.println(i);
    }
  }

  // 2) Print odd numbers between 1-255
  public static void printOddNums1to255() {
    for(int i = 1; i < 256; i++) {
      if(i % 2 != 0) {
        System.out.println(i);
      }
    }
  }

  // 3) Print Sum
  public static void printSum() {
    int sum = 0;
    for(int num = 0; num < 256; num++) {
      sum += num;
      System.out.println("Number " + num + ", Sum: " + sum);
    }
  }

  // 4) Iterating through an array
  public static void iterateArray(int[] numArr) {
    for(int num:numArr) {
      System.out.println(num);
    }
  }

  // 5) Find Max
  public static void findMax(int[] maxArr) {
    int max = maxArr[0];
    for(int maxNum:maxArr) {
      if(maxNum > max) {
        max = maxNum;
      }
    }
    System.out.println(max);
  }

  // 6) Get Average
  public static void getAvg(int[] avgArr) {
    // double avg;
    int sum = 0;
    for(int num:avgArr) {
      sum += num;
    }
    double avg = (double) (sum/avgArr.length);
    System.out.println(avg);
  }

  // 7) Array with Odd Numbers
  public static void oddArr() {
    ArrayList<Integer> arr = new ArrayList<Integer>();
    for(int i=1; i < 256; i=i+2) {
        arr.add(i);
    }
    // System.out.println(Arrays.toString(arr));
    System.out.println(arr);
  }

  // 8) Greater Than Y
  public static void greaterThanY(int[] arr, int y) {
    int count = 0;
    for(int i=0; i < arr.length; i++) {
      if(arr[i] > y) {
        count++;
      }
    }
    System.out.println(count);
  }

  // 9) Square the values
  public static void sqrVal(int[] arr) {
    for(int i = 0; i < arr.length; i++) {
      arr[i] = arr[i] * arr[i];
    }
    System.out.println(Arrays.toString(arr));
  }

  // 10) Eliminate Negative Numbers
  public static void elimNeg(int[] negArr) {
    for(int i = 0; i < negArr.length; i++) {
      if(negArr[i] < 0) {
        negArr[i] = 0;
      }
    }
    System.out.println(Arrays.toString(negArr));
  }

  // 11) Max, Min, and Average
  public static void maxMinAvg(int[] arr) {
    int min = arr[0];
    int max = arr[0];
    int sum = 0;
    for(int i=0; i < arr.length; i++) {
        if(arr[i] > max) {
          max = arr[i];
        }
        if(arr[i] < min) {
          min = arr[i];
        }
        sum += arr[i];
    }
    double avg = sum / arr.length;
    System.out.println("Max: " + max + ", Min: " + min + ", Avg: " + avg);
  }
  // 12) Shifting the Values in the Array
  public static void shiftingVals(int[] shiftArr) {
    for(int i = 0; i < shiftArr.length-1; i++) {
      shiftArr[i] = shiftArr[i+1];
    }
    shiftArr[shiftArr.length-1] = 0;
    System.out.println(Arrays.toString(shiftArr));
  }




// MAIN program method
  public static void main(String[] args) {
    // BasicJava.print1to255();
    // BasicJava.printOddNums1to255();
    // BasicJava.printSum();
    // BasicJava.iterateArray(new int[]{1,3,5,7,9,13});
    // BasicJava.findMax(new int[]{1,3,5,7,9,13,-3, -5, -7});
    // BasicJava.getAvg(new int[]{2, 10, 3});
    // BasicJava.oddArr();
    // BasicJava.greaterThanY(new int[]{1, 3, 5, 7, 9, 10}, 3);
    // BasicJava.sqrVal(new int[]{1, 5, 10, -2});
    // BasicJava.elimNeg(new int[]{1, 5, 10, -2});
    // BasicJava.maxMinAvg(new int[]{1, 5, 10, -2});
    // BasicJava.shiftingVals(new int[]{1, 5, 10, -2});
  }

}
