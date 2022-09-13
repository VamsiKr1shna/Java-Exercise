package com.infy.model;
//Follow the class diagram strictly
public class CandidateReport {
	private Integer candidateId;
	private String candidateName;
	private Integer mark1;
	private Integer mark2;
	private Integer mark3;
	private char result;
	private String grade;
	
	public CandidateReport(Integer candidateId,String candidateName,Integer mark1,Integer mark2,Integer mark3,char result,String grade) {
		setCandidateId(candidateId);
		setCandidateName(candidateName);
		setMark1(mark1);
		setMark2(mark2);
		setMark3(mark3);
		setResult(result);
		setGrade(grade);
		
	}
	
	public Integer getCandidateId() {
		return candidateId;
	}
	public void setCandidateId(Integer candidateId) {
		this.candidateId = candidateId;
	}
	public String getCandidateName() {
		return candidateName;
	}
	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}
	public Integer getMark1() {
		return mark1;
	}
	public void setMark1(Integer mark1) {
		this.mark1 = mark1;
	}
	public Integer getMark2() {
		return mark2;
	}
	public void setMark2(Integer mark2) {
		this.mark2 = mark2;
	}
	public Integer getMark3() {
		return mark3;
	}
	public void setMark3(Integer mark3) {
		this.mark3 = mark3;
	}
	public Character getResult() {
		return result;
	}
	public void setResult(Character result) {
		this.result = result;
		}
	public void setGrade(String grade) {
		this.grade=grade;
	}
	public String getGrade() {
		return grade;
	}

	
	
}