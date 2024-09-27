package org.launchcode;

public interface OpticalDrive {

	int SIZE = 120;

	void spin();

	void storeData(int writeAmount);

	void writeData(int writeAmount);

	void readData();

	String reportData();



}
