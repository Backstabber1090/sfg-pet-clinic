package com.sood.vaibhav.sfgpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.sood.vaibhav.sfgpetclinic.model.Pet;
import com.sood.vaibhav.sfgpetclinic.services.PetService;
@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

	@Override
	public Set<Pet> findAll() {// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public Pet findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Pet Save(Pet type) {
		return super.save(type);
	}

	@Override
	public void Delete(Pet object) {
		super.deleteByObject(object);
		
	}

	@Override
	public void DeleteById(Long id) {
	super.deleteById(id);
	}

}
