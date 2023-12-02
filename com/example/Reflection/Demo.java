package com.example.Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Demo {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		Cat cat=new Cat("Pretty",2);
		Field[] fields=cat.getClass().getDeclaredFields();
		
		System.out.println("Fields in Cat class:");
		for(Field field:fields) {
			System.out.print(field.getName()+" ");
		}
		System.out.println();
		for(Field field:fields) {
			if(field.getName().equals("name")) {
				field.setAccessible(true);
				field.set(cat,"PrettyPretty");
			}
		}
		System.out.println();
		System.out.println(cat.getName());
		System.out.println();
		
		System.out.println("Methods in Cat class:");
		Method[] methods=cat.getClass().getDeclaredMethods();
		for(Method method:methods) {
			System.out.println(method.getName()+" ");
		}
		System.out.println();
		for(Method method:methods) {
			if(method.getName().equals("meow")) {
				method.invoke(cat);
			}
			if(method.getName().equals("heyThisIsPrivate")) {
				method.setAccessible(true);
				method.invoke(cat);
			}
			if(method.getName().equals("thisIsAPublicStaticMethod")) {
				method.setAccessible(true);
				method.invoke(null);//for static methods, set null, anyway static method not called object
			}
			if(method.getName().equals("thisIsAPrivateStaticMethod")) {
				method.setAccessible(true);
				method.invoke(null);//for static methods, set null, anyway static method not called object
			}
		}
	}
}
class Cat{
	private final String name;
	private int age;
	
	public Cat(String name, int age) {
		this.name=name;
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void meow() {
		System.out.println("meow meow");
	}
	@SuppressWarnings("unused")
	private void heyThisIsPrivate() {
		System.out.println("How did you call this?");
	}
	public static void thisIsAPublicStaticMethod() {
		System.out.println("Am public and static");
	}
	@SuppressWarnings("unused")
	private static void thisIsAPrivateStaticMethod() {
		System.out.println("Am private and static");
	}
}