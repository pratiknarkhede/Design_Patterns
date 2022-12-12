package com.pratik.adapter;


public class TestAdapter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpeedMPH bugattiVeyron = new BugattiVeyron();
		SpeedKMPH bugattiVeyronAdapter=new SpeedAdapter(bugattiVeyron);
		System.out.println("without using adpater, speed in mph :"+bugattiVeyron.getSpeed());
		System.out.println("after using adpater, speed in kmph :"+bugattiVeyronAdapter.getSpeed());
	}

}
