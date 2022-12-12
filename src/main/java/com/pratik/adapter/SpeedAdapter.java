package com.pratik.adapter;
/**we have two different interfaces SpeedKMPH and SpeedMPH 
 * we want speed in KMPH but client is only exposed to SpeedMPH 
 *so to give speed in kmph we will simply create an adapter class 
 *which will adapt to speed in kmph 
 */
public class SpeedAdapter implements SpeedKMPH {
	private SpeedMPH luxuryCars;

	// consist of private method convertMPHtoKMPH() that will be used for the
	// conversion

	

	
	/**
	 *since we dont have method to directly get a speed in kmph we are calling mph speed method and converting accordingly
	 */
	@Override
	
	public double getSpeed() {
		
		return convertMPHtoKMPH(luxuryCars.getSpeed());
	}

	public SpeedAdapter(SpeedMPH luxuryCars) {
		super();
		this.luxuryCars = luxuryCars;
	}

	private double convertMPHtoKMPH(double mph) {
		return mph * 1.60934;
	}
}