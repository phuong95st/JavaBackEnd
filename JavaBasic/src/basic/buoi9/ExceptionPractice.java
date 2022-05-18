package basic.buoi9;

import basic.buoi7.CustomException;
import basic.buoi7.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


// mảng 5 sinh viên.
// nếu > 5 sinh viên => lớp đã đầy
// nếu sinh viên có ngày sinh trước 1-1-1990 => ngày sinh không hợp lệ.
// nếu name là empty => name không để trống.
public class ExceptionPractice
{

	private List<Student> classRoom;

	public ExceptionPractice()
	{
		classRoom = new ArrayList<>(5);
	}

	public void insert(Student student)
	{
		if (checkCountElement() && validateStudent(student))
			this.classRoom.add(student);
	}

	public boolean checkCountElement()
	{
		if (this.classRoom.size() > 5)
		{
			System.out.println("Class room is full");
			return false;
		}

		return true;
	}

	public boolean validateStudent(Student student)
	{
		if (student == null)
			return false;

		if (student.getName() == null || student.getName().isEmpty())
			throw new CustomException("Name is required");
		if (student.getBirthDay() == null || student.getBirthDay().isBefore(LocalDate.of(1970, 1, 1)))
			throw new CustomException("Invalid Birth day");

		return true;
	}

	public static void request()
	{
		// init class room
		ExceptionPractice e = new ExceptionPractice();
		try
		{
			// add student
			e.insert(new Student(1, "a", LocalDate.of(1980, 3, 20)));
			e.insert(new Student(1, "b", LocalDate.of(1990, 3, 20)));
			e.insert(new Student(1, "c", LocalDate.of(1900, 3, 20)));
			e.insert(new Student(1, "d", LocalDate.of(1900, 3, 20)));
			e.insert(new Student(1, "e", LocalDate.of(1900, 3, 20)));
			e.insert(new Student(1, "f", LocalDate.of(1900, 3, 20)));
		}
		catch (Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}

	public static void main(String[] args)
	{
		ExceptionPractice.request();
	}
}
