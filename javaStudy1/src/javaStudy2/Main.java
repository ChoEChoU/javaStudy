package javaStudy2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 2, 3, 5, 4, 8, 6, 7};
//		System.out.println(array[2]);
		
		BubbleSort sort = new BubbleSort();
		sort.sort(array);
		
		NumberBaseball baseball = new NumberBaseball();
		
		baseball.makeNumber();
		
		System.out.println(baseball.playGame(3, 4, 6));
	}

}
