package com.ATD.demoRestex;

import java.sql.Date;

public class Student {

	private String STUDENT_NO;
	private String STUDENT_NAME;
	private Date STUDENT_DOB;
	private Date STUDENT_DOJ;
	public String getSTUDENT_NO() {
		return STUDENT_NO;
	}
	public void setSTUDENT_NO(String sTUDENT_NO) {
		STUDENT_NO = sTUDENT_NO;
	}
	public String getSTUDENT_NAME() {
		return STUDENT_NAME;
	}
	public void setSTUDENT_NAME(String sTUDENT_NAME) {
		STUDENT_NAME = sTUDENT_NAME;
	}
	public Date getSTUDENT_DOB() {
		return STUDENT_DOB;
	}
	public void setSTUDENT_DOB(Date sTUDENT_DOB) {
		STUDENT_DOB = sTUDENT_DOB;
	}
	public Date getSTUDENT_DOJ() {
		return STUDENT_DOJ;
	}
	public void setSTUDENT_DOJ(Date sTUDENT_DOJ) {
		STUDENT_DOJ = sTUDENT_DOJ;
	}
	@Override
	public String toString() {
		return "Student [STUDENT_NO=" + STUDENT_NO + ", STUDENT_NAME=" + STUDENT_NAME + ", STUDENT_DOB=" + STUDENT_DOB
				+ ", STUDENT_DOJ=" + STUDENT_DOJ + "]";
	}
	
	
}
