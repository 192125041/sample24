package learn.hiber;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Person {
	@Id
	int id;
	String nickName;
	@OneToOne
	AdharCard card;
	public Person() {
		super();
	}
	public Person(int id, String nickName, AdharCard card) {
		super();
		this.id = id;
		this.nickName = nickName;
		this.card = card;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public AdharCard getCard() {
		return card;
	}
	public void setCard(AdharCard card) {
		this.card = card;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", nickName=" + nickName + ", card=" + card + "]";
	}
	
}
