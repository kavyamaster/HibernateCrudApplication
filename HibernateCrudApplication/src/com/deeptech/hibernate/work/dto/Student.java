package com.deeptech.hibernate.work.dto;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="student")
public class Student {
	 public int getId() { 
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRollname() {
		return rollname;
	}
	public void setRollname(int rollname) {
		this.rollname = rollname;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	 @Id
	 @Column(name="S_ID")
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	 private int id;
	 @Column(name="S_rollnumber")
	 private int rollname;
	  @Column(name="S_studentname")
	 private String studentname;//class Entities
	 @Column(name="S_course")
	 private String course;  // generate getter and setter method
}
