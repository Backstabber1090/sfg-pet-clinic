package com.sood.vaibhav.sfgpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.sood.vaibhav.sfgpetclinic.model.Owner;
import com.sood.vaibhav.sfgpetclinic.services.OwnerService;
@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

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
