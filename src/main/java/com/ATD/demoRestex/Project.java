package com.ATD.demoRestex;

public class Project {

	private String PRJ_NO;
	private String PRJ_NAME;
	private int PRJ_DUR;
	private String PRJ_PLATFORM;
	public String getPRJ_NO() {
		return PRJ_NO;
	}
	public void setPRJ_NO(String pRJ_NO) {
		PRJ_NO = pRJ_NO;
	}
	public String getPRJ_NAME() {
		return PRJ_NAME;
	}
	public void setPRJ_NAME(String pRJ_NAME) {
		PRJ_NAME = pRJ_NAME;
	}
	public int getPRJ_DUR() {
		return PRJ_DUR;
	}
	public void setPRJ_DUR(int pRJ_DUR) {
		PRJ_DUR = pRJ_DUR;
	}
	public String getPRJ_PLATFORM() {
		return PRJ_PLATFORM;
	}
	public void setPRJ_PLATFORM(String pRJ_PLATFORM) {
		PRJ_PLATFORM = pRJ_PLATFORM;
	}
	@Override
	public String toString() {
		return "Project [PRJ_NO=" + PRJ_NO + ", PRJ_NAME=" + PRJ_NAME + ", PRJ_DUR=" + PRJ_DUR + ", PRJ_PLATFORM="
				+ PRJ_PLATFORM + "]";
	}
	

}
