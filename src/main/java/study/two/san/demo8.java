package study.two.san;
/*
设计一个方法求数组的最大值，并将最大值返回
 */
public class demo8 {
    public static void main(String[] args) {
        int[] arr={11,22,3,44};
        System.out.println(arr(arr));
    }
    public static int arr(int[] arr){
        int temp=arr[0];
        for(int i=0;i<arr.length;i++){
            if(temp<arr[i]){
                temp=arr[i];
            }
        }
        return temp;
    }
}
