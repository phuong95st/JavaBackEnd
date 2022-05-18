package basic.buoi7;

import com.sun.xml.internal.bind.v2.runtime.reflect.ListIterator;
import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

import java.time.LocalDate;



public class Student
{
	private int id;
	private String name;
	private String major;
	private LocalDate birthDay;

	public Student(){
		
	}

	public Student(int id, String name, LocalDate birthDay)
	{
		this.id = id;
		this.name = name;
		this.birthDay = birthDay;
	}

	public Student(int id, String name, String major)
	{
		this.id = id;
		this.name = name;
		this.major = major;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getMajor()
	{
		return major;
	}

	public void setMajor(String major)
	{
		this.major = major;
	}

	public LocalDate getBirthDay()
	{
		return birthDay;
	}

	public void setBirthDay(LocalDate birthDay)
	{
		this.birthDay = birthDay;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == null || !(obj instanceof Student))
			return false;

		Student student = (Student) obj;

		if (this.id == student.getId() && this.name == student.getName() && this.major == student.getMajor())
		{
			return true;
		}

		return false;
	}

	public void process()
	{
		Student a = new Student(1, "Phuong", "Anh");
		Student b = new Student(1, "Phuong", "Anh");
		Student c = new Student(2, "Phuong", "Anh");
		if (a.equals(b))
		{
			System.out.println(" a = b");
		}
		if (a.equals(c))
		{
			System.out.println("a = c");
		}
		else
		{
			System.out.println(" a!=c ");
		}
	}

	public static Student[] sortByName(Student[] students)
	{
		for (int i = 0; i < students.length - 1; i++)
		{
			for (int j = 0; j < students.length - i - 1; j++)
			{
				if (students[j].getName().compareTo(students[j + 1].getName()) > 0)
				{
					Student temp = students[j];
					students[j] = students[j + 1];
					students[j + 1] = temp;
				}
			}
		}
		return students;
	}


	// main
	public static void main(String[] args)
	{

	}
}
