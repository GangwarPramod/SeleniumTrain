package JavaPractice.src.arrayProgramme;

public class largestElementinArray {

    public static void findElement(int []arr){
        int j= arr.length-1;
        for(int i=0;i<=arr.length-1;i++){
           if(arr[i]<arr[j]){
               System.out.println(arr[i]);

           }
           else if(arr[i]>arr[j]){
              j--;
               System.out.println(arr[i]);
           }


        }
    }

    public static void main(String[] args){
        int [] arr=new int[]{23,32,12,2,4,87,92,21};
        findElement(arr);
    }
}
