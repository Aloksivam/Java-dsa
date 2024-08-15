package CoreJava.OopsComplete;

public class ComparingObjects {
	public static void main(String[] args) {
		System.out.println("hello");
		Student st = new Student("alok",13);
		Student st2 = new Student(st);
		Student st33 = st;
		st33.name="shivam";
		System.out.println(st.name);
		System.out.println(st2);
		//calling out constructor without any argument
		Student st3 = new Student();
		System.out.println(st3.name);
		System.out.println(st3.rollno);
	}
}
class Student{
	String name;
	int rollno;
	
	public Student() {
		this("alok",14);
	}
	
	public Student(Student other){
		this.name = other.name;
		this.rollno = other.rollno;
	}
	public Student(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
	}
}