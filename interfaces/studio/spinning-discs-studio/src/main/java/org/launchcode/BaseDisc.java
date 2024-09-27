package org.launchcode;

public abstract class BaseDisc {

	private int speed;
	private boolean isSpinning = false;
	private boolean isReading = false;
	private boolean isWriting = false;
	private String fileType;
	private int capacity;


	public BaseDisc(int speed, String fileType) {
		this.speed = speed;
		this.fileType = fileType;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isReading() {
		return isReading;
	}

	public void setReading(boolean reading) {
		isReading = reading;
	}

	public boolean isSpinning() {
		return isSpinning;
	}

	public void setSpinning(boolean spinning) {
		isSpinning = spinning;
	}

	public boolean isWriting() {
		return isWriting;
	}

	public void setWriting(boolean writing) {
		isWriting = writing;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public void play(){
		setSpinning(true);
		setReading(true);
		System.out.println("Disc is playing");
	}

	public void stop(){
		setSpinning(false);
		setReading(false);
		setSpeed(0);
	}

	public void pause(){
		setReading(false);
	}

	public void write(){
		if (!isSpinning){
			setSpinning(true);
		}
		setWriting(true);
		setReading(false);
	}



}
