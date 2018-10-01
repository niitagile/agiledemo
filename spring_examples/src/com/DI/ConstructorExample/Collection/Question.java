package com.DI.ConstructorExample.Collection;

import java.util.Iterator;
import java.util.List;

public class Question {
private int q_no;
private String ques;
private List<String> answers;

public Question() {}
public Question(int q_no, String ques, List<String> answers) {
	super();
	this.q_no = q_no;
	this.ques = ques;
	this.answers = answers;
}

public void displayInfo(){
	System.out.println(q_no+" "+ques);
	System.out.println("answers are:");
	/*Iterator<String> itr=answers.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());}*/
	for(String ans : answers)
		System.out.println(ans);
	}
}


