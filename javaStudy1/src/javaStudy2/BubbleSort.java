package javaStudy2;

public class BubbleSort {
	private int swapCnt;
	public BubbleSort() {
	}
	
	public int[] sort(int[] inputArray){
		for (int i = 0; i < inputArray.length; i++) {
			for (int j = 1; j < inputArray.length-i; j++) {
				if (inputArray[j-1] > inputArray[j]) {
					int temp = inputArray[j];
					inputArray[j] = inputArray[j-1];
					inputArray[j-1] = temp;
					swapCnt++;
				}
			}
		}
		return inputArray;
	}
	
	public int getSwapCnt() {
		return swapCnt;
	}
}
