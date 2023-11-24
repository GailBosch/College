// -- Wk 5 - This6 --
//// this Passed as an Argument in a Method Call
//
//public class Student
//{  
//    void method1(Student m1)
//    {
//        System.out.println("This is method 1");
//    }
//
//    void method2()
//    {
//        method1(this);
//    }
//    public static void main(String[] args)
//    {  
//	Student m = new Student();  
//	m.method2();
//    }
//} 

// -- Wk 5 - This5 --
// Constructor Chaining

// Call to this() must be the first statement in constructor
public class Student
{  
    private int studentNum;  
    private String name, course;  
    private float fee;

    Student(int studentNum, String name, String course)
    {  
	this.studentNum = studentNum;  
	this.name = name;  
	this.course = course;  
    }

    Student(int studentNum, String name, String course, float fee)
    {  
	this(studentNum, name, course); // Reusing constructor  
	this.fee = fee;  
    }  
    void display()
    {
	System.out.println(studentNum +" "+name+" "+course+" "+fee);
    }
} 

// -- Wk 5 - This1 --
//// this: to refer to the current class instance variable
//
//// Each argument to the constructor shadows one of the object's
//// fields â€” inside the constructorÂ idÂ is a local copy of the
//// constructor's first argument. To refer to theÂ Student fieldÂ id,
//// the constructor must useÂ this.id
//
//public class Student
//{
//    int id;
//    String name;
//
//    Student(int id, String name)
//    {
//	this.id = id;
//	this.name = name;
//    }
//
//    public void display()
//    {
//	System.out.println(id + " " + name);
//    }
//
//    public static void main(String[] args)
//    {
//        Student s = new Student(123, "Joe");
//        s.display();
//    }
//}

// -- Wk 4 - Student2 --
//public class Student
//{
//    private String name;
//
//    public Student(String s)
//    {
//        name = s;
//    }
//  
//    public Student()
//    {
//        name = "Unknown";
//    }
//	
//    public void printName()
//    {
//	 System.out.println(name);
//    }
//}

// -- Wk 4 - Student1 --
//// Parameterized Constructor - Compile time error
//public class Student
//{
//    private int var=5;
//
//    Student(int num)
//    {
//	var = num;
//    }
//
//
//    public int getValue()
//    {
//	return var;
//    }
//
//    public static void main(String[] args)
//    {
//	Student ob = new Student(5);
//	System.out.println("value is: " + ob.getValue());
//    }
//}

// -- Wk 2 - Student2 --
//public class Student {
//	
//	private int age;
//	
//	public double getAge()
//    {
//        return age;
//    }
//
//    public boolean setAge(int a)
//    {
//    	if (a>=0 && a<130) {
//    		age = a;
//    		return true;
//    	}
//        return false;
//    }
//	
//	public static void main(String[] args) {
//		Student s = new Student();
//		s.setAge(21);
//		
//		Student s2 = new Student();
//		s2.setAge(-1);
//	}
//}

// -- Wk 2 - Student1 --
////Encapsulation - problem
//public class Student
//{
//public int age;
//
//public static void main(String[] args)
//{
// Student s = new Student();
// s.age = 21;
//
// Student s2 = new Student();
// s2.age = -1;
//}
//}

//-- Wk 1 - Student2 --
//public class Student
//{
// private String name;
// private int dob;
// private String course;
//
// public String getName()
// {
//     return name;
// }
//
// public void setName(String studentName)
// {
//     name = studentName;
// }
////â€¦â€¦
//}

// -- Wk 1 - Student1 --
//public class Student
//{
//    String forename;
//    String surname;
//}
