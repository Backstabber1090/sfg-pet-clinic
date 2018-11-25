package com.sood.vaibhav.sfgpetclinic.services;
import java.util.Set;

public interface CrudService<T,ID> {
Set<T> findAll();
T findById(ID id);
T Save(T type);
void Delete(T Type);
void DeleteById(ID id);
}
