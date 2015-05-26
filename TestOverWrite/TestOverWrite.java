// 重载，一个类，参数名，overload
// 重写 overwrite  override 

class Person {
	private String name;
	private int  age;
	public void setName (String name) {this.name = name;}
	public void setAge (int age) {this.age = age;}
	public String getName () {return name;}
	public int getAge() {return age;}
	public String getInfo() {
		return "Name: "+ name +"\n" +"age: "+ age;
	}
}

class Student extends Person {
	private String school;
	public String getSchool() {return school;}
	public void setSchool(String school) {this.school = school;}
	public String getInfo() {
		return "Name: "+ getName() +"\n" +"age: "+ getAge()
				+ "\nschool: " + school;
	}
}

public class TestOverWrite {
	public static void main(String[] args){
		Student student = new Student ();
		Person person = new Person ();
		person.setName ("none");
		person.setAge (1000);
		student.setName ("Xiumei");
		student.setAge (28);
		student.setSchool ("Olivet University");
		System.out.println(person.getInfo ());
		System.out.println(student.getInfo ()); 
	}
}