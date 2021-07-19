package javaStudy5;

import java.util.ArrayList;

public class BusRoute {
	private BusStation station;
	private int first;
	private int second;
	private ArrayList<BusStation> set;
	
	public BusRoute(int first, int second, ArrayList<BusStation> stationSet) {
		this.first = first;
		this.second = second;
		set = stationSet;
	}
	
	public void routeNumber() {
		if (first < second) {
			while (first < second) {
				int number = set.get(set.indexOf(first)).getStationNum();
			}
		} 
		else if (second < first){

		}
	}
}
