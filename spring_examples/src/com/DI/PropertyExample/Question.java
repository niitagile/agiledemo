package com.DI.PropertyExample;


import java.util.List;

public class Question {
private int q_no;
private String ques;
private List<String> answers;


public int getQ_no() {
	return q_no;
}


public void setQ_no(int q_no) {
	this.q_no = q_no;
}


public String getQues() {
	return ques;
}


public void setQues(String ques) {
	this.ques = ques;
}


public List<String> getAnswers() {
	return answers;
}


public void setAnswers(List<String> answers) {
	this.answers = answers;
}


public void displayInfo(){
	System.out.println(q_no+" "+ques);
	System.out.println("answers are:");
	for(String ans : answers)
		System.out.println(ans);
	}
}


