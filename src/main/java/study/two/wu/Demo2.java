package study.two.wu;
/*
把一个数组中的元素复制到另一个新数组中去
 */
public class Demo2 {
    public static void main(String[] args) {
        //定义数组
        int[] arr={1,2,3,4,5,6};
        //首先想到循环
        //定义空数组
        int [] arr1=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] =arr[i];
        }
        for (int i = 0; i <arr1.length ; i++) {
            System.out.println(arr1[i]);
        }
    }
}
