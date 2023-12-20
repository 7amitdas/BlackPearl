package hackerrank.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * Hacker Rank Java > Data Structures
 * 
 * Java Sort {@link} https://www.hackerrank.com/challenges/java-sort
 */
public class JavaSort {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());

		List<Student> studentList = new ArrayList<Student>();
		while (testCases > 0) {
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();

			Student st = new Student(id, fname, cgpa);
			studentList.add(st);

			testCases--;
		}
		Comparator<Student> studentComp = new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				if (s1.getCgpa() < s2.getCgpa()) {
					return 1;
				} else if (s1.getCgpa() > s2.getCgpa()) {
					return -1;
				} else {
					return 0;
				}
			}
		};
		Collections.sort(studentList, studentComp.thenComparing(Student::getFname).thenComparing(Student::getId));
		for (Student st : studentList) {
			System.out.println(st.getFname());
		}
		in.close();
	}
}

class Student {
	private int id;
	private String fname;
	private double cgpa;

	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}

	public String getFname() {
		return fname;
	}

	public double getCgpa() {
		return cgpa;
	}
}