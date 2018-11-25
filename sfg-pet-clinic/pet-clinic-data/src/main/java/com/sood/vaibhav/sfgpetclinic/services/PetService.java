import java.util.Set;

public interface PetService {

	Pet findByLastName(String LastName);
	Pet findById(Long id);
Pet save (Pet owner);
Set<Pet> findAll();

}
