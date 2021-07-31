package com.mph.model;

<<<<<<< HEAD
import java.io.Serializable;

public class Salary implements Serializable{
=======
public class Salary {
	
>>>>>>> a8e69c1c64a3a6e8f45578a2573539ea8e1519f5
	private int basic;
	private float da;
	private float hra;
	private float pf;
	private float grossSalary;
	private float netSalary;

	public int getBasic() {
		return basic;
	}

	public void setBasic(int basic) {
		this.basic = basic;
	}

	public float getDa() {
		return da;
	}

	@Override
	public String toString() {
		return "Salary [basic=" + basic + ", da=" + da + ", hra=" + hra + ", pf=" + pf + ", grossSalary=" + grossSalary
				+ ", netSalary=" + netSalary + "]";
	}

	public void setDa(float da) {
		this.da = da;
	}

	public float getHra() {
		return hra;
	}

	public void setHra(float hra) {
		this.hra = hra;
	}

	public float getPf() {
		return pf;
	}

	public void setPf(float pf) {
		this.pf = pf;
	}

	public float getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(float grossSalary) {
		this.grossSalary = grossSalary;
	}

	public float getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(float netSalary) {
		this.netSalary = netSalary;
	}

}

