package com.pratik.decorator;

public class JingleBells extends TreeDecorator{

	
	public JingleBells(ChristmasTree tree) {
		super(tree);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String decorate() {
		return super.decorate()+AddJingleBells();
	}

	private String AddJingleBells() {
		return " with jingle bells";
	}
	

	

}
