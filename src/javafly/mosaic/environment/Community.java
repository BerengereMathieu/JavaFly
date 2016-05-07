package javafly.mosaic.environment;

public class Community {

	Integer labelIdx;
	Integer bbXMin;
	Integer bbYMin;
	Integer bbXMax;
	Integer bbYMax;
	Integer size;
	
	public Community(Integer labelIdx, Integer bbXMin, Integer bbYMin) {
		super();
		this.labelIdx = labelIdx;
		this.bbXMin = bbXMin;
		this.bbYMin = bbYMin;
		this.bbXMax = bbXMin;
		this.bbYMax = bbYMin;
		this.size = 1;
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
	

}
