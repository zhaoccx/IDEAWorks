package cn.com.datastructure.base.code21;

public class Test3DArray {
	public static void main(String[] args) {
		int[][][] arr = new int[][][]{
			{{1,2,3},{2,3,4,5}},
			{{10,11,12,13},{14,15,16,17}}
			};
			
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				for(int k = 0; k < arr[i][j].length; k++) {
					System.out.print(arr[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println("-------------------");
		}
		
		for(int[][] arr2D : arr) {
			for(int[] arrD : arr2D) {
				for(int i : arrD) {
					System.out.print(i + " ");
				}
				System.out.println();
			}
			System.out.println("-------------------");
		}
	}
}