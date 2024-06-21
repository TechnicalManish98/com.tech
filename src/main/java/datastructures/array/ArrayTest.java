package datastructures.array;

public class ArrayTest {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9};

        int[] ints = insertIntoArray(arr, 2, 100);
        for (int i=0; i< ints.length; i++) {
            System.out.print(ints[i] + " ");
        }
    }

    private static int[] insertIntoArray(int[] arr, int i, int valueToUpdate) {

        int[] newArr = new int[arr.length + 1];
        int index = 0;
        while (index < i) {
            newArr[index] = arr[index];
            index++;
        }
        newArr[i] = valueToUpdate;

        for (int j = i+1; j < newArr.length; j++) {
            newArr[j] = arr[i];
            i++;
        }

        return newArr;
    }
}
