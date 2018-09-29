package cn.com.datastructure.base.code20;

public class Test2DArray {
	public static void main(String[] args) {
		int[][] arr = new int[][]{{1,2,3,4,5},{2,3,4,5,6},{3,4,5,6,7},{4,5,6,7,8}};

		
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		for(int[] iarr : arr) {
			for(int i : iarr) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}