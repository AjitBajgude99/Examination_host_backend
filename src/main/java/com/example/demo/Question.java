package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Question
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
int id;
String name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Question [id=" + id + ", name=" + name + ", getId()=" + getId() + ", getName()=" + getName()
			+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}
public Question(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
public Question() {
	super();
	// TODO Auto-generated constructor stub
}

}
