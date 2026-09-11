package study.two.san;
/*
需求：定义一个方法copyOfRange(int[] arr,int from, int to)
功能：将数组arr中从索引from（包括from）开始。
到索引to结束（不包括to）的元素复制到新数组中，将新数组返回
 */
public class demo10 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,67,7,8};
        int[] copy=copyOfRange(arr,3,7);
        for(int i=0;i<copy.length;i++){
            System.out.println(copy[i]);
        }

    }
    public static int[] copyOfRange(int[] arr,int from,int to){
        int[] arry=new int[to-from];
        int index=0;
        for(int i=from;i<to;i++){
            arry[index]=arr[i];
            index++;
        }
        return arry;
    }
}
