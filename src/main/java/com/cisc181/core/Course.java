package com.cisc181.core;

import java.util.UUID;

import com.cisc181.eNums.eMajor;

public class Course {
	private UUID CourseID;
	private String CourseName;
	private int GradePoints;
	private eMajor Major;
	
	public Course(){
		
	}
	
	public Course(UUID CourseID, String CourseName, int GradePoints, eMajor major){
		CourseID = CourseID;
		
		CourseName = CourseName;
		
		GradePoints = GradePoints;
		
		Major = major;
	}
	
	
	public eMajor geteMajor(){
		return Major;
	}
	
	public void seteMajor(eMajor Major){
		this.Major = Major;
	}
	
	
	public UUID getCourseID() {
		return CourseID;
	}
	
	public void setCourseID(UUID courseID) {
		this.CourseID = courseID;
	}
	
	public String getCourseName() {
		return CourseName;
	}
	
	public void setCourseName(String courseName) {
		this.CourseName = courseName;
	}
	
	public int getGradePoints() {
		return GradePoints;
	}
	
	public void setGradePoints(int GradePts) {
		this.GradePoints = GradePts;
	}
	

}