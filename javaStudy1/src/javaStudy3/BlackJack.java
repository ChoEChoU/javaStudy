package javaStudy3;

public class BlackJack {
	
	public int playGame(int[] numSet, int m) {
		
		int result = 0;
		
		for (int i = 0; i < numSet.length; i++) {
			for (int j = 0; j < numSet.length; j++) {
				for (int k = 0; k < numSet.length; k++) {
					int first = numSet[i];
					int second = numSet[j];
					int third = numSet[k];
					if (i == j || j == k || k == i) {
						continue;
					}
					else {
						if (first + second + third <= m) {
							if (first + second + third > result) {
								result = first + second + third;
							}
						}
					}
				}
			}
		}
		return result;
	}
}
