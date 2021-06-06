package javaStudy2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 5, 4, 3, 2};
		System.out.println(array[2]);
		
		BubbleSort sort = new BubbleSort();
		sort.sort(array);
		System.out.println(array[2]);
	}

}
