package com.cisc181.core;

import java.util.UUID;

public class Section {
	private UUID CourseID;
	private UUID SemesterID;
	private UUID SectionID;
	private int RoomID;

	public Section() {

	}

	public Section(UUID CourseID, UUID SemesterID, UUID SectionID, int RoomID) {
		this.CourseID = CourseID;
		this.SemesterID = SemesterID;
		this.SectionID = SectionID;
		this.RoomID = RoomID;
	}

	public UUID getCourseID() {
		return CourseID;
	}

	public void setCourseID(UUID courseID) {
		this.CourseID = courseID;
	}
	
	public UUID getSectionID() {
		return SectionID;
	}

	public void setSectionID(UUID sectionID) {
		this.SectionID = sectionID;
	}

	public UUID getSemesterID() {
		return SemesterID;
	}

	public void setSemesterID(UUID semesterID) {
		this.SemesterID = semesterID;
	}

	
	public int getRoomID() {
		return RoomID;
	}

	public void setRoomID(int roomID) {
		this.RoomID = roomID;
	}

}