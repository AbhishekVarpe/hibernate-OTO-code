package in.hiber;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Teacher 
{
	@Id
	private int id;
	private String nameString;
	private String posiotinString;
	@OneToOne
	private Student student;
	
	public Teacher() {
		// TODO Auto-generated constructor stub
	}

	public Teacher(int id, String nameString, String posiotinString, Student student) {
		super();
		this.id = id;
		this.nameString = nameString;
		this.posiotinString = posiotinString;
		this.student = student;
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

	public String getPosiotinString() {
		return posiotinString;
	}

	public void setPosiotinString(String posiotinString) {
		this.posiotinString = posiotinString;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", nameString=" + nameString + ", posiotinString=" + posiotinString + ", student="
				+ student + "]";
	}
	
	
	
	
	

}
