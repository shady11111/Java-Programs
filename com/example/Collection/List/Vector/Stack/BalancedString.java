package com.example.Collection.List.Vector.Stack;

import java.util.Stack;

public class BalancedString {

	public static void main(String[] args) {
		System.out.println(isBalanced("{[()]}"));
	}
	public static boolean isBalanced(String s) {
		Stack<Character> stack=new Stack<>();
		
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			
			if(c=='{'||c=='['||c=='(') {
				stack.push(c);
			}
			else if(c=='}'||c==']'||c==')') {
				if(stack.isEmpty()||(!pair(stack.pop(),c)))return false;
			}
		}
		return stack.isEmpty();
	}
	public static boolean pair(char c1, char c2) {
		if(c1=='{'&&c2=='}')return true;
		if(c1=='('&&c2==')')return true;
		if(c1=='['&&c2==']')return true;
		return false;
	}
}