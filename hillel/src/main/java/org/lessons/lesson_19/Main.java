package org.lessons.lesson_19;

import java.util.Arrays;
import java.util.Collections;

public class Main {

  public static void main(String[] args) {


    // O(n) - ?

    // O(1) - constant

    // O(log(n)*n) - ?

    // O(n^2) - matrix

    // O(n^3)

    //3! = 1*2*3

//    Collections.sort();
    //Arrays.sort();


    //1 2 3 5 8 13








  }


 //Bubble
  public static void bubbleSort(int[] array) {
    boolean sorted = false;
    int temp;
    while(!sorted) {
      sorted = true;
      for (int i = 0; i < array.length - 1; i++) {
        if (array[i] > array[i+1]) {
          temp = array[i];
          array[i] = array[i+1];
          array[i+1] = temp;
          sorted = false;
        }
      }
    }
  }

  //Insertion

  public static void insertionSort(int[] array) {
    for (int i = 1; i < array.length; i++) {
      int current = array[i];
      int j = i - 1;
      while(j >= 0 && current < array[j]) {
        array[j+1] = array[j];
        j--;
      }
      // в этой точке мы вышли, так что j так же -1
      // или в первом элементе, где текущий >= a[j]
      array[j+1] = current;
    }
  }

  //merge



  public static void mergeSort(int[] array, int left, int right) {
    if (right <= left) return;
    int mid = (left+right)/2;
    mergeSort(array, left, mid);
    mergeSort(array, mid+1, right);
    merge(array, left, mid, right);
  }

  static void merge(int[] array, int left, int mid, int right) {
    // вычисляем длину
    int lengthLeft = mid - left + 1;
    int lengthRight = right - mid;


    // создаем временные подмассивы
    int leftArray[] = new int[lengthLeft];
    int rightArray[] = new int[lengthRight];


    // копируем отсортированные массивы во временные
    for (int i = 0; i < lengthLeft; i++)
      leftArray[i] = array[left + i];
    for (int i = 0; i < lengthRight; i++)
      rightArray[i] = array[mid + i + 1];


    // итераторы содержат текущий индекс временного подмассива
    int leftIndex = 0;
    int rightIndex = 0;


    // копируем из leftArray и rightArray обратно в массив
    for (int i = left; i < right + 1; i++) {
      // если остаются нескопированные элементы в R и L, копируем минимальный
      if (leftIndex < lengthLeft && rightIndex < lengthRight) {
        if (leftArray[leftIndex] < rightArray[rightIndex]) {
          array[i] = leftArray[leftIndex];
          leftIndex++;
        } else {
          array[i] = rightArray[rightIndex];
          rightIndex++;
        }
      }
      // если все элементы были скопированы из rightArray, скопировать остальные из leftArray
      else if (leftIndex < lengthLeft) {
        array[i] = leftArray[leftIndex];
        leftIndex++;
      }
      // если все элементы были скопированы из leftArray, скопировать остальные из rightArray
      else if (rightIndex < lengthRight) {
        array[i] = rightArray[rightIndex];
        rightIndex++;
      }
    }
  }

  public static  int runBinarySearchRecursively(
          int[] sortedArray, int key, int low, int high) {
    int middle = low  + ((high - low) / 2);

    if (high < low) {
      return -1;
    }

    if (key == sortedArray[middle]) {
      return middle;
    } else if (key < sortedArray[middle]) {
      return runBinarySearchRecursively(
              sortedArray, key, low, middle - 1);
    } else {
      return runBinarySearchRecursively(
              sortedArray, key, middle + 1, high);
    }
  }

  public static int getFactorial(int f) {
    if (f <= 1) {
      return 1;
    }
    else {
      return f * getFactorial(f - 1);
    }
  }

  public static void fibonachy(int n) {
    int[] fibonachy = new int[n];
    fibonachy[0] = 0;
    fibonachy[1] = 1;
    for (int i = 2; i < fibonachy.length; i++) {
      fibonachy[i] = fibonachy[i - 1] + fibonachy[i - 2];
    }
    for (long i : fibonachy) {
      System.out.println(i);
    }
  }


}


