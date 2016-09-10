package com.BitC.test;

public class MyString {
	
	protected char name[];
	
	public void setData(char i_name[]) {
		this.name = new char[i_name.length];
		System.arraycopy(i_name, 0, this.name, 0, i_name.length);
	}
	
	public char[] getData() {
		return this.name;
	}

}
