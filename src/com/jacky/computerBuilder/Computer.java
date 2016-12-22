package com.jacky.computerBuilder;

public abstract class Computer {
	protected String mBoard;
	protected String mDisplay;
	protected String mOS;
	
	protected Computer(){}
	
	
	 
	/**
	 * @param mBoard the mBoard to set
	 */
	public void setmBoard(String mBoard) {
		this.mBoard = mBoard;
	}

	 

	/**
	 * @param mDisplay the mDisplay to set
	 */
	public void setmDisplay(String mDisplay) {
		this.mDisplay = mDisplay;
	}

	 

	/**
	 * @param mOS the mOS to set
	 */
	public abstract void setmOS( );
	
	
	/**
	 *  override toString to 
	 *  print the computer
	 * 
	 */
	@Override
	public String toString() {
 		return  "Computer [mBoard = "+mBoard+", mDisplay = "+mDisplay+", mOS= "+mOS+"]"
 				;
	}
	
 	
}
