package com.revature.eval.java.core;

public class Main {
	public final static void main(String[] args) {
		String result = new EvaluationService().acronym("I like an Apple.");
		System.out.println(result);
	}
}
