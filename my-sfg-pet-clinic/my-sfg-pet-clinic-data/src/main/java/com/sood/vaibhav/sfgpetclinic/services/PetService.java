package com.sood.vaibhav.sfgpetclinic.services;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.sood.vaibhav.sfgpetclinic.model.Pet;
@Service
public interface PetService extends CrudService<Pet,Long> {

}
