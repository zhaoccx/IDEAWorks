package cn.com.datastructure.base.code17;

public class TestCopy2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6};
        int[] copyArr = new int[100];
        System.arraycopy(arr,0,copyArr,94,6);

        for(int i : copyArr) {
            System.out.print(i + " ");
        }
    }
}