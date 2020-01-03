package com.bridgelabz.utility;

public class Stack {
	char data = 0;
	char stack[] = new char[10];
	int size = 0;
	int top = -1;

	public void push(char c) {
		top++;
		stack[top] = c;
	}

	public boolean isEmpty() {
		if (top == -1) {
			return true;
		} else {
			return false;

		}
	}

	public char peek() {
		char c = stack[top];
		return c;
	}

	public void pop() {
		data = stack[top];
		stack[top] = 0;
		top--;
	}

}
