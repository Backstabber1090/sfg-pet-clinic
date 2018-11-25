package com.sood.vaibhav.sfgpetclinic.services.map;

import java.util.Set;

import com.sood.vaibhav.sfgpetclinic.model.Vet;
import com.sood.vaibhav.sfgpetclinic.services.CrudService;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {

	@Override
	public Set<Vet> findAll() {// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public Vet findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Vet Save(Vet type) {
		return super.save(type.getId(),type);
	}

	@Override
	public void Delete(Vet object) {
		super.deleteByObject(object);
		
	}

	@Override
	public void DeleteById(Long id) {
	super.deleteById(id);
	}

}
