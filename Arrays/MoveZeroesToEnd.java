package Arrays;

import java.util.Arrays;

public class MoveZeroesToEnd {
  int[] arr;

  MoveZeroesToEnd(int[] arr) {
    this.arr = arr;
    implementation();

    System.out.println("Array after moving to right is " + Arrays.toString(arr));
  }

  void implementation() {
    int left = 0;
    int right = arr.length - 1;
    while (left < right) {
      if (arr[right] == 0) {
        right--;
      }

      if (arr[left] == 0) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        right--;
      }
      left++;
    }
  }
}
