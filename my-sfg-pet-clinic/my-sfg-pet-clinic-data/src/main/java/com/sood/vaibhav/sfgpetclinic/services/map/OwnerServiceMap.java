package com.sood.vaibhav.sfgpetclinic.services.map;

import java.util.Set;

import com.sood.vaibhav.sfgpetclinic.model.Owner;
import com.sood.vaibhav.sfgpetclinic.services.CrudService;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

	@Override
	public Set<Owner> findAll() {// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public Owner findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Owner Save(Owner type) {
		return super.save(type.getId(),type);
	}

	@Override
	public void Delete(Owner object) {
		super.deleteByObject(object);
		
	}

	@Override
	public void DeleteById(Long id) {
	super.deleteById(id);
	}

}
