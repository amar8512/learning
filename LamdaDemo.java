import java.util.function.*;

class Student{
	int age;
	StudentVerifier studentVerifier;
        
        public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return this.age;
	}
}


interface StudentVerifier{
	public boolean isEligibleForMovies(Student s);
}


class LamdaDemo{
	public static void main(String args[]){
		Student student = new Student();
		student.setAge(15);

		StudentVerifier studentVerifier = s->student.getAge()>16;

		System.out.println("Is the student eligible for movies??? : "+studentVerifier.isEligibleForMovies(student));

	}
}
