package com.sood.vaibhav.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sood.vaibhav.sfgpetclinic.model.Owner;
import com.sood.vaibhav.sfgpetclinic.model.Vet;
import com.sood.vaibhav.sfgpetclinic.services.OwnerService;
import com.sood.vaibhav.sfgpetclinic.services.VetService;
import com.sood.vaibhav.sfgpetclinic.services.map.OwnerServiceMap;
import com.sood.vaibhav.sfgpetclinic.services.map.VetServiceMap;
@Component
public class DataLoader implements CommandLineRunner{

	private final OwnerService ownerService;
	private final VetService vetService;
	
	
	
	public DataLoader(OwnerService ownerService, VetService vetService) {
		super();
		this.ownerService = ownerService;
		this.vetService = vetService;
	}

	@Override
	public void run(String... args) throws Exception {
		Owner owner1 = new Owner();
		owner1.setFirstName("Michael");
		owner1.setLastName("Hopkins");
		
		ownerService.Save(owner1);
		
		Owner owner = new Owner();
		owner.setFirstName("Hopkins");
		owner.setLastName("John");
		
		ownerService.Save(owner);
		System.out.println("Owners Loaded" + ownerService.findAll());
		
		
		
		
		Vet vet1 = new Vet();
		vet1.setFirstName("Doc");
		vet1.setLastName("Ventura");
		
		vetService.Save(vet1);
		
		
		

		Vet vet = new Vet();
		vet.setFirstName("Doc");
		vet.setLastName("Ace");
		
		vetService.Save(vet);
		
		System.out.println( "Vets Loaded"+ vetService.findAll());
		
	}

}
