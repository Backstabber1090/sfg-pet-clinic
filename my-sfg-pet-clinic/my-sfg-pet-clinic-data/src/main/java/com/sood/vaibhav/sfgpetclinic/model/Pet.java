package com.sood.vaibhav.sfgpetclinic.model;

import java.time.LocalDate;

public class Pet {
private PetType petType;
private Long id;
public PetType getPetType() {
	return petType;
}
public void setPetType(PetType petType) {
	this.petType = petType;
}
public Owner getOwner() {
	return owner;
}
public void setOwner(Owner owner) {
	this.owner = owner;
}
public LocalDate getBirthDate() {
	return birthDate;
}
public void setBirthDate(LocalDate birthDate) {
	this.birthDate = birthDate;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
private Owner owner;
private LocalDate birthDate;

}