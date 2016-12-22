package com.jacky.computerBuilder;

public abstract class Builder {
	public abstract void buildBoard(String mBoard);
	public abstract void buildDisplay(String mDisplay);
	public abstract void buildOS();
	public abstract Computer create();
}	
