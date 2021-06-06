package javaStudy2;

public class BubbleSort {
	private int swapCnt;
	public BubbleSort() {
	}
	
	public int[] sort(int[] inputArray){
		for (int i = 0; i < inputArray.length; i++) {
			for (int j = 0; j < inputArray.length-i; j++) {
				if (inputArray[i] < inputArray[i+1]) {
					int temp = inputArray[i];
					inputArray[i] = inputArray[i+1];
					inputArray[i+1] = temp;
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
