/**
 * 
 *<p> javadocs comment at class level
 *
 * =======================================
 * 
 * <p>This is class called student to capture Student
 * details and display is same 
 * <p>In the future the result of the student will
 * be integrated with this class
 * 
 * @author  Leo Monteiro
 *@version 1.0.0
 *@since 2022-03-23
 */
public class Student {
	
	String name;
	int age;
	/**
	 * <p>This is a parameterised constructor to
	 * initialise the attribute
	 * 
	 * @param name  This is the name of the student 
	 * @param age  This is the age of the student
	 */
	
	public Student(String name, int age) 
	
	{
		this.name= name;
		this.age= age;
	}
	/**
	 * This is a copy constructor
	 * @param s object to be copied for 
	 */
	Student(Student s)
	{
		name = s.name;
		age = s.age;
	}
	/**
	 * <p>This is the setter method to set the name of the student
	 *
	 * @param age Age of the Student
	 */
	public void setAge(int age)
	{
		this.age=age;
		
	}
	/**
	 * This is the getter method for the age attribute
	 * 
	 * @return age of the Student 
	 */
	public int getAge() 
	{
		return age;
	}
	/**
	 * This is setter method
	 * @param name of the student
	 */

	public void setName
	(String name)
	{
		this.name= name;
	}
	/**
	 * This is a getter method to get the name 
	 * @return name of the student 
	 */
	public String getName()
	{
		return name;
	}
	/**
	 * This is the method to display the student details
	 * This is a link to {@link #getName()}
	 * This is a link to {@link #getAge()}
	 */
	public void display()
	{
		System.out.println("Name of the student is "+getName());
		System.out.println("Age  of the student is "+getAge());
	}
	/**
	 * This is the main program ehich the entry point
	 * <p>for execution of this program
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student ("john",23);
		s1.display();
		
		Student s2 = new Student ("Alex",28);
		s2.display();
	}

}
