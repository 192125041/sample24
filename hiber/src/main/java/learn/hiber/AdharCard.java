package learn.hiber;
import java.util.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class AdharCard {
	@Id
	int addNum;
	String name;
	String addres;
	String gender;
	@OneToOne
	Person person;
	public AdharCard() {
		super();
	}
	public AdharCard(int addNum, String name, String addres, String gender, Person person) {
		super();
		this.addNum = addNum;
		this.name = name;
		this.addres = addres;
		this.gender = gender;
		this.person = person;
	}
	public int getAddNum() {
		return addNum;
	}
	public void setAddNum(int addNum) {
		this.addNum = addNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddres() {
		return addres;
	}
	public void setAddres(String addres) {
		this.addres = addres;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	@Override
	public String toString() {
		return "AdharCard [addNum=" + addNum + ", name=" + name + ", addres=" + addres + ", gender=" + gender
				+ ", person=" + person + "]";
	}
	
}
