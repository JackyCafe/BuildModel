package com.jacky.computerBuilder;

public class MacBookBuilder extends Builder{
	Computer mComputer = new MacBook(); 
	@Override
	public void buildBoard(String mBoard) {
		mComputer.setmBoard(mBoard);
	}

	@Override
	public void buildDisplay(String mDisplay) {
		mComputer.setmDisplay(mDisplay);
	}

	@Override
	public void buildOS() {
 		mComputer.setmOS();
	}

	@Override
	public Computer create() {
 		return mComputer;
	}

}
