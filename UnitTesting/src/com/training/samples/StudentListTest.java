package com.training.samples;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StudentListTest {

	StudentList stlst = new StudentList();

	@Before
	public void setUp() throws Exception {
		System.out.println("Before Called *********");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After Called *********");
	}

	@Test
	public void testStudentList() {
		// fail("Not yet implemented");
		int size = stlst.names.size(); // To get the size of "names" list
		assertEquals(3, size, 0);
	}

	@Test
	public void testGetNames() {
		// fail("Not yet implemented");
		assertNotNull(stlst.names);
	}

	@Test
	public void testGetNamesType() {
		// fail("Not yet implemented");
		Set<String> names = new HashSet<String>();
		Object obj = names.getClass();
		Object str = stlst.getNames().getClass();
		assertEquals(obj, str);
	}

	@Test
	public void testSetAcceptDuplicate() {

		Student s1 = new Student(101, "Anurag");
		Student s2 = new Student(101, "Anurag");

		HashSet<Student> stud = new HashSet<Student>();

		stud.add(s1);
		stud.add(s2);

		stlst.setNameList(stud);

		int actual = stlst.getNameList().size();

		assertEquals(1, actual);

	}

}
