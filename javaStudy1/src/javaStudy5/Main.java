package javaStudy5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<BusStation> stationSet = new ArrayList<BusStation>();

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for (int i = 0; i < n; i++) {
			BusStation station = new BusStation(i);
			stationSet.add(station);
		}
		
		int m = scan.nextInt();
		
		for (int i = 0; i < m; i++) {
			int first = scan.nextInt();
			int second = scan.nextInt();
			
			if (first < second) {
				while (first < second) {
					
				}
			}
		}
	}

}
