package javaStudy2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 2, 3, 5, 4, 8, 6, 7};
		
		BubbleSort sort = new BubbleSort();
		sort.sort(array);
		
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
		System.out.println(array[5]);
		System.out.println(array[6]);
		System.out.println(array[7]);
		
		NumberBaseball baseball = new NumberBaseball();
		
		baseball.makeNumber();
		
		System.out.println(baseball.playGame(3, 4, 6));
	}

}
