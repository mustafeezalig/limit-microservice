package com.limit.bean;

public class Limits {

	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public Limits() {
		super();
	}
	public Limits(int min, int max) {
		super();
		this.min = min;
		this.max = max;
	}
	private int min;
	private int max;
}
