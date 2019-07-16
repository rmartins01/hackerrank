package ifood;

import java.util.Scanner;

/*
 * Create the Student class.
 */
class Student{
	static int index = 0;
	
	private String studentName;
	
	@Override
	public String toString() {
		return index + ": "+this.studentName;
	}

	public Student(String studentName) {
		index++;
		this.studentName = studentName;
		
	}
	
}




public class Class2 {   
    private static final Scanner INPUT_READER = new Scanner(System.in);

    public static void main(String[] args) {
        int numberOfStudents = Integer.parseInt(INPUT_READER.nextLine());
        
        while (numberOfStudents-- > 0) {
            String studentName = INPUT_READER.nextLine();
            Student student = new Student(studentName);
            
            System.out.println(student.toString());
        }
    }
}