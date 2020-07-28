package database.databasedemo.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.Objects;

import javax.persistence.*;

@Entity
@NamedQuery(name="find_all_persons", query="select p from Person p")
public class Person {

	@Id
	@GeneratedValue

	private int id;

	private String firstName;
	private String lastName;
	private String email;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/mm/yyyy")
	private Date birthDate;

	public Person() {
	}

	public Person(int id, String firstName, String lastName,String email, Date birthDate) {
		this(firstName,lastName,email,birthDate);
		this.id = id;
	}

	public Person(String firstName, String lastName,String email, Date birthDate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.birthDate = birthDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "Person{" +
				"id=" + id +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", email='" + email + '\'' +
				", birthDate=" + birthDate +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Person person = (Person) o;
		return id == person.id &&
				firstName.equals(person.firstName) &&
				lastName.equals(person.lastName) &&
				email.equals(person.email) &&
				birthDate.equals(person.birthDate);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, firstName, lastName, email, birthDate);
	}
}