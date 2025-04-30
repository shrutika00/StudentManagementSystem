class Education
{
	String course;
	int yop;
	double marks;
	String uni;

	Education(String course,int yop,double marks,String uni)
	{

		super();
		this.course=course;
		this.yop=yop;
		this.marks=marks;
		this.uni=uni;

	}
	void displayEducation(){
		System.out.println("Education details");
		System.out.println("Course:"+course);
		System.out.println("yop:"+yop);
		System.out.println("marks:"+marks);
		System.out.println("university"+uni);
		System.out.println();
	}
}
class Address
{
	String area;
	String city;
	String state;
	int pincode;

	Address(String area,String city,String state,int pincode)
	{
		this.area=area;
		this.city=city;
		this.state=state;
		this.pincode=pincode;

	}

	public void displayAddress()
	{
		System.out.println("Address info:");
		System.out.println("Area:"+area);
		System.out.println("city:"+city);
		System.out.println("state:"+state);
		System.out.println("pincode:"+pincode);
	}

}
class Student
{
	String name;
	Long contact;
	String dob;
	String email;
	Address address;
	Education edu;

	Student(String name,Long contact,String dob,String email,Education edu,Address address)
	{
		this.name=name;
		this.contact=contact;
		this.dob=dob;
		this.email=email;
		this.edu=edu;
		this.address=address;
	}
	Student(Student old)
	{
		this.name=old.name;
		this.contact=old.contact;
		this.dob=old.dob;
		this.email=old.email;
		this.edu=old.edu;
		this.address=old.address;
	}
	public void displayStudent()
	{
		System.out.println("Student Details:");
		System.out.println("Name:"+name);
		System.out.println("contact:"+contact);
		System.out.println("dob"+dob);
		System.out.println("email"+email);
		System.out.println();
		address.displayAddress();
		System.out.println();
		edu.displayEducation();

	}
}
class StudentDriver
{
	public static void  main(String[] args)
	{
		Address address=new Address
		("Deccan","Pune","Maharashtra",411038);

		Education edu=new Education
		("BTECH-CSE",2026,9.8,"SPPU");

		Student old=new Student("Ramesh Kumar",
			9822089764l,"ramesh@gmail.com","01/01/2000",edu,address);


		old.displayStudent();
		System.out.println("______________________________________________");
		System.out.println();
		System.out.println("Copy below");
		System.out.println();
		Student copy=new Student(old);
		copy.displayStudent();


		System.out.println("_______________________________________________");
		System.out.println("copy after change");
		copy.edu.course="be";
		copy.displayStudent();


		System.out.println("________________________________________________");
		System.out.println("original obj after change");
		System.out.println();
		old.displayStudent();


	}
}