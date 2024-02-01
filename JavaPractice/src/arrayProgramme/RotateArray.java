package JavaPractice.src.arrayProgramme;

public class RotateArray
{
    public static void Reverse(int[] arr, int start, int end){

        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void Rotatearray(int[] arr, int n, int d) {

        Reverse(arr,0,d-1);
        Reverse(arr,d,n-1);
        Reverse(arr,0,n-1);
    }public static void main (String[]args){
            int[] arr = new int[]{1, 4, 5, 2, 6, 7};
            int d = 3;
            int n=arr.length;
            Rotatearray(arr,n, d);
    for (int i : arr) {
        System.out.println(i);
    }
            }
        }


