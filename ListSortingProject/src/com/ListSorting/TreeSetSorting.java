package com.ListSorting;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;
class Student
{
	int stu_id;
	String stu_name;

	//constructor
public Student(int stu_id, String stu_name)
{
			super();
			this.stu_id = stu_id;
			this.stu_name = stu_name;
}
	@Override
	public String toString()
	{
		return "Student [stu_id=" + stu_id + ", stu_name=" + stu_name + "]";
	}
}
//sorting for student id
class StudentSortCompareId implements Comparator<Student>
	{

		@Override
		public int compare(Student o1, Student o2) {
			if(o1.stu_id>o2.stu_id)
			   return 1;
			else if(o1.stu_id<o2.stu_id)
				return -1;
			else
				return 0;
		}
		
	}//sorting for student name
class StudentSortCompareName implements Comparator<Student>
	{

		@Override
		public int compare(Student o1, Student o2) {
			
				return o1.stu_name.compareTo(o2.stu_name);}}
 
public class TreeSetSorting {

	public static void main(String[] args) {
		//add which part we need to sort
		TreeSet<Student> tsob=new TreeSet<Student>(new StudentSortCompareId());
		Student sob1=new Student(1, "latha");
		Student sob2=new Student(2, "deepa");
		Student sob3=new Student(3, "kani");
		Student sob4=new Student(4, "pavi");
		//adding objects
		tsob.add(sob4);
		tsob.add(sob1);
		tsob.add(sob3);
		tsob.add(sob2);
		//before sorting
		System.out.println(tsob);
		//after sorting
		Iterator<Student> itob=tsob.iterator();
		while(itob.hasNext())
		{
			Student stob=itob.next();
			System.out.println(stob.stu_id+" "+stob.stu_name);
		}
	System.out.println("after sorting id");
	Iterator<Student> itob1=tsob.iterator();
	while(itob1.hasNext())
	{
		Student stob1=itob1.next();
		System.out.println(stob1.stu_id+" "+stob1.stu_name);
	}
	System.out.println("----------------------------------");
	//sorting based on  names 
	TreeSet<Student> tsob1=new TreeSet<Student>(new StudentSortCompareName());
	Student sob11=new Student(2, "latha");
	Student sob21=new Student(3, "deepa");
	Student sob31=new Student(1, "kani");
	Student sob41=new Student(4, "keerthi");
	//adding objects
	tsob1.add(sob41);
	tsob1.add(sob11);
	tsob1.add(sob31);
	tsob1.add(sob21);
	System.out.println(tsob1);
	//after sorting
	Iterator<Student> itob3=tsob1.iterator();
	while(itob3.hasNext())
	{
		Student stob2=itob3.next();
		System.out.println(stob2.stu_id+" "+stob2.stu_name);
	}
	System.out.println("after sorting name");
	//iteration
	Iterator<Student> itob4=tsob1.iterator();
	while(itob4.hasNext())
	{
		Student stob3=itob4.next();
		System.out.println(stob3.stu_id+" "+stob3.stu_name);
	}
}
}


