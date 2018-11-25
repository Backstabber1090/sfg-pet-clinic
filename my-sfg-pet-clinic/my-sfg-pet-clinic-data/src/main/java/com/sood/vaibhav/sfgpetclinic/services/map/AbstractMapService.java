package com.sood.vaibhav.sfgpetclinic.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService <T, ID>{
protected Map<ID,T> map = new HashMap<>();
Set<T> findAll(){
return new HashSet<>(map.values());	
}
T save (ID id, T type) {
	map.put(id, type);
	return type;
}
void deleteById(ID id) {
	map.remove(id);
}
void deleteByObject(T object) {
	map.entrySet().removeIf( entry -> entry.getValue().equals(object));
}
public T findById(Long id) {
	
	return map.get(id);
}
}
