package javaStudy3;

public class BlackJack {
	private int[] numSet;
	private int m = 0;
	
	public int playGame(int[] numSet, int m) {
		this.numSet = numSet;
		this.m = m;
		
		int result = 0;
		
		int first = numSet[0];
		int second = numSet[1];
		int third = numSet[2];
		
		result = first + second + third;
		
		for (int i = 0; i < numSet.length; i++) {
			first = numSet[i];
			for (int j = 0; j < numSet.length; j++) {
				second = numSet[j];
				for (int k = 0; k < numSet.length; k++) {
					third = numSet[k];
					if (i == j || j == k || k == i) {
						continue;
					}
					else {
						if (first + second + third <= m) {
							if (first + second + third > result) {
								result = first + second + third;
							}
						}
						else {
							continue;
						}
					}
				}
				if (i == j) {
					continue;
				}
			}
		}
		return result;
	}
}
