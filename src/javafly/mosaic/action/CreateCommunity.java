package javafly.mosaic.action;

import javafly.mosaic.environment.Environment;

public class CreateCommunity implements Action{

	
	final Integer labelIdx;
	final Integer x;
	final Integer y;

	/**
	 * 
	 * @param labelIdx community label
	 * @param x first site abscissa
	 * @param y first site ordinate
	 */
	public CreateCommunity(Integer labelIdx, Integer x, Integer y) {
		super();
		this.labelIdx = labelIdx;
		this.x = x;
		this.y = y;
	}

	@Override
	public Environment apply(Environment t) {

		Environment updatedEnvironment=new Environment(t);
		
		updatedEnvironment.addCommunity(labelIdx, x, y);
		
		return null;
	}
	
	public String toString(){
		return "Create community";
		
	}
}
