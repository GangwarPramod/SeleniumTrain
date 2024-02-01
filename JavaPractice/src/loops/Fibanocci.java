package JavaPractice.src.loops;

public class Fibanocci {
    static int count=10;
   static int n1=0,n2=1,n3=0;

    public static void getFibanocci(int count){

        if(count>0){
           n3= n2+n1;
            n1=n2;
            n2=n3;

            System.out.println(" "+n3);
            getFibanocci(count-1);
        }

    }
    public static void main(String[]args){
        System.out.println(n1 +" "+n2);
        getFibanocci(count-2);
    }
}
