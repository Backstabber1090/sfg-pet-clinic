import java.util.Set;

public interface VetService {

	Vet findByLastName(String LastName);
	Vet findById(Long id);
Vet save (Vet owner);
Set<Vet> findAll();

}
