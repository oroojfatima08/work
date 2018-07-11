package com.springbatch.bean;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement(name = "ExamResult")
public class ExamResult {

	private String studentName;

	private double percentage;

	//@XmlElement(name = "StudentName")
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	//@XmlElement(name = "Percentage")
	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "ExamResult [studentName=" + studentName + ", percentage=" + percentage + "]";
	}

	

}
