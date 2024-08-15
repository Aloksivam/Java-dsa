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
		Student st4 = new Student();
		System.out.println(st3.name);
		System.out.println(st3.rollno);
		System.out.println(Student.population);
		new ComparingObjects().fun();
	}
	 void fun(){
//		ComparingObjects cm = new ComparingObjects();
//		cm.greeting();
		 greeting();
	}
	static void greeting(){
		System.out.println("good morning");
	}
}
class Student{
	String name;
	static int population=0;
	int rollno;
	
	public Student() {
		this("alok",14);
		Student.population++;
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