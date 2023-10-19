package com.cg.model;

public class Vehicles {
	
	private int vId;
	private String vBrand;
	private String vtype;
	private String color;
	
	public Vehicles() {}

	public Vehicles(int vId, String vBrand, String vtype, String color) {
		super();
		this.vId = vId;
		this.vBrand = vBrand;
		this.vtype = vtype;
		this.color = color;
	}

	public int getvId() {
		return vId;
	}

	public void setvId(int vId) {
		this.vId = vId;
	}

	public String getvBrand() {
		return vBrand;
	}

	public void setvBrand(String vBrand) {
		this.vBrand = vBrand;
	}

	public String getVtype() {
		return vtype;
	}

	public void setVtype(String vtype) {
		this.vtype = vtype;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Vehicles [vId=" + vId + ", vBrand=" + vBrand + ", vtype=" + vtype + ", color=" + color + "]";
	}
	
	

}
