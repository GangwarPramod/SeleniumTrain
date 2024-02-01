package JavaPractice.src.arrayProgramme;

public class DeleteinArray {

    public static void main (String [] args) {

        int[] arr = new int[]{10, 13, 43, 21, 46, 32, 54};
        int deleteEle = 21;
        int n = arr.length;
        int i, j;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == deleteEle) {
                break;
            }

        }
        if (i == n) {
            System.out.println(n);
        }
        for (j = i; j < n - 1; j++) {
            arr[j] = arr[j + 1];
        }
        System.out.println(n - 1);
        for (i = 0; i <=n-1; i++) {
            System.out.println(arr[i]);
        }


    }
}
