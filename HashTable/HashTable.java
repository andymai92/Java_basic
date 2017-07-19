// Author: Anh N Mai (Andy)
// San Jose - California
import java.util.HashMap;

public class HashTable {
	public static HashMap<Integer, Student> buildMap(Student[] students) {
		HashMap<Integer, Student> map = new HashMap<Integer, Student>();
		for (Student s : students)
			map.put(s.getId(), s);
		return map;
	}

	public static void main(String[] args) {
		Student[] students = new Student[3];
		for (int i = 0; i < students.length; i++) {
			students[i] = new Student();
			students[i].id = i;
			students[i].name = "John Lenon " + i;
		}
	// Test the first element in HashMap
		HashMap<Integer, Student> map = buildMap(students);
		System.out.println((map.get(1)).name);

	}

}
