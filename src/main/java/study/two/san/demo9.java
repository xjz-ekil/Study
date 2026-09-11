package study.two.san;
/*
定义一个方法判断数组中的某一个数是否存在，将结果返回给调用处
 */
public class demo9 {
    public static void main(String[] args) {
        int[] arrr={11,233,14,15,51};

        System.out.println(arr(233,arrr));
    }

    public static boolean arr(int a,int[] arr){

        for(int i=0;i<arr.length;i++){
            if(a==arr[i]){
                return true;
            }
        }
        return false;
    }
}
