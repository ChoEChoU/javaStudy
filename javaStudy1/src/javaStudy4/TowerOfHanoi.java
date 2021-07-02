package javaStudy4;

public class TowerOfHanoi {
	public void move(int number, int from, int to, int via) {
		if (number == 1) {
			System.out.print(from + " " + to);
			System.out.println("");
		}
		else {
			move(number-1, from, via, to);
			System.out.print(from + " " + to);
			System.out.println("");
			move(number-1, via, to, from);
		}
	}
}
