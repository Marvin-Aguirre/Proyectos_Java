package com.example.demo.entites;

public class Paciente {
	private Long id;
	private String firstName;
	private String secondName;
	private String surname;
	private String secondSurname;
	private String age;
	
	public Paciente(Long id, String firstName, String secondName, String surname, String secondSurname, String age) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.secondName = secondName;
		this.surname = surname;
		this.secondSurname = secondSurname;
		this.age = age;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getSecondSurname() {
		return secondSurname;
	}

	public void setSecondSurname(String secondSurname) {
		this.secondSurname = secondSurname;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	
	
	
	
	
}
