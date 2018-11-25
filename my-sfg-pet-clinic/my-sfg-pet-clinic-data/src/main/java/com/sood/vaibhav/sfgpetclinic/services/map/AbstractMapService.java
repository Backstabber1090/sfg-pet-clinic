package com.sood.vaibhav.sfgpetclinic.services.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import com.sood.vaibhav.sfgpetclinic.model.BaseEntity;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {
	protected Map<Long, T> map = new HashMap<>();

	Set<T> findAll() {
		return new HashSet<>(map.values());
	}

	T save(T type) {
		
		if (type!=null)
		{
			if (type.getId() == null) {
				type.setId(getNextId());
			}
		}
		
		map.put(type.getId(), type);
		return type;
	}

	void deleteById(ID id) {
		map.remove(id);
	}

	void deleteByObject(T object) {
		map.entrySet().removeIf(entry -> entry.getValue().equals(object));
	}

	public T findById(Long id) {

		return map.get(id);
	}
	
	
	
	private Long getNextId() {
		Long nextId =null; 
			try {	
				
				nextId=	Collections.max(map.keySet())+1;
			}
			catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
			nextId=1L;
			}
		
		return nextId;
	}
}
