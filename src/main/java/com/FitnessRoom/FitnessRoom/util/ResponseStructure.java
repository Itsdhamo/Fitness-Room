package com.FitnessRoom.FitnessRoom.util;

public class ResponseStructure<t> {
	private String message;
	private int status;
	private t data;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public t getData() {
		return data;
	}
	public void setData(t data) {
		this.data = data;
	}
}
