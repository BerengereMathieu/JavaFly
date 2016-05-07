package javafly.mosaic.environment;

public class Community {
	
	
	public Community(Integer labelIdx, Integer bbXMin, Integer bbYMin, Integer bbXMax, Integer bbYMax, Integer size) {
		super();
		this.labelIdx = labelIdx;
		this.bbXMin = bbXMin;
		this.bbYMin = bbYMin;
		this.bbXMax = bbXMax;
		this.bbYMax = bbYMax;
		this.size = size;
	}

	public Integer getLabelIdx() {
		return labelIdx;
	}
	
	public Integer getBbXMin() {
		return bbXMin;
	}
	public void setBbXMin(Integer bbXMin) {
		this.bbXMin = bbXMin;
	}
	public Integer getBbYMin() {
		return bbYMin;
	}
	public void setBbYMin(Integer bbYMin) {
		this.bbYMin = bbYMin;
	}
	public Integer getBbXMax() {
		return bbXMax;
	}
	public void setBbXMax(Integer bbXMax) {
		this.bbXMax = bbXMax;
	}
	public Integer getBbYMax() {
		return bbYMax;
	}
	public void setBbYMax(Integer bbYMax) {
		this.bbYMax = bbYMax;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	Integer labelIdx;
	Integer bbXMin;
	Integer bbYMin;
	Integer bbXMax;
	Integer bbYMax;
	Integer size;
	

}
