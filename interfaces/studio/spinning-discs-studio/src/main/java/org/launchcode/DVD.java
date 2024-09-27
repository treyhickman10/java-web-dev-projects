package org.launchcode;

public class DVD extends BaseDisc implements OpticalDrive{

	public DVD(int speed, String fileType) {
		super(speed, fileType);
	}

	@Override
	public void spin() {
		setSpeed(getSpeed() + 200);
	}

	@Override
	public void storeData(int writeAmount) {
		setCapacity(getCapacity() - writeAmount * 2);
	}

	@Override
	public void writeData(int writeAmount) {
		setWriting(true);
		setCapacity(getCapacity() - writeAmount * 2);
	}

	@Override
	public void readData() {
		System.out.println(this.getFileType() + "is playing video and audio");
	}

	@Override
	public String reportData() {
		return "";
	}


	// TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
