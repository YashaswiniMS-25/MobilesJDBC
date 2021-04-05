package com.wolken.wolkenapp.DTO;

public class MobilesDTO {
	private int mobileid;
	private String modelname;
	private double price;
	private int memeory;
	private String brandname;
	private String serialno;
	private int noofcam;
	public MobilesDTO() {
		super();
	}
	public int getMobileid() {
		return mobileid;
	}
	public void setMobileid(int mobileid) {
		this.mobileid = mobileid;
	}
	public String getModelname() {
		return modelname;
	}
	public void setModelname(String modelname) {
		this.modelname = modelname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getMemeory() {
		return memeory;
	}
	public void setMemeory(int memeory) {
		this.memeory = memeory;
	}
	public String getBrandname() {
		return brandname;
	}
	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	public String getSerialno() {
		return serialno;
	}
	public void setSerialno(String serialno) {
		this.serialno = serialno;
	}
	public int getNoofcam() {
		return noofcam;
	}
	public void setNoofcam(int noofcam) {
		this.noofcam = noofcam;
	}

}
