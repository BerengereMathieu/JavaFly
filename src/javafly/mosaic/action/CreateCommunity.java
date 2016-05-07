package javafly.mosaic.action;

import javafly.mosaic.environment.Environment;

public class CreateCommunity implements Action{

	
	final Integer labelIdx;

	
	public CreateCommunity(Integer labelIdx) {
		super();
		this.labelIdx = labelIdx;
	}
	

	@Override
	public Environment apply(Environment t) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String toString(){
		return "Create community";
		
	}
}
