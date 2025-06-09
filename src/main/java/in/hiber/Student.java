package in.hiber;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
@Entity
public class Student {
	@Id
	private int id;
	private String nameString;
	private String addressString;
	private int mark;
	@OneToOne
	private Teacher teacher;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String nameString, String addressString, int mark, Teacher teacher) {
		super();
		this.id = id;
		this.nameString = nameString;
		this.addressString = addressString;
		this.mark = mark;
		this.teacher = teacher;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public String getAddressString() {
		return addressString;
	}

	public void setAddressString(String addressString) {
		this.addressString = addressString;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", nameString=" + nameString + ", addressString=" + addressString + ", mark="
				+ mark + ", teacher=" + teacher + "]";
	}
	
	

}
