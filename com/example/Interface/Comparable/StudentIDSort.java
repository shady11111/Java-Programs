package com.example.Interface.Comparable;

import java.util.Comparator;

public class StudentIDSort  implements Comparator<Student>{
	public int compare(Student s1, Student s2) {
        // Compare based on age
        return Integer.compare(s1.ID, s2.ID);
    }
}