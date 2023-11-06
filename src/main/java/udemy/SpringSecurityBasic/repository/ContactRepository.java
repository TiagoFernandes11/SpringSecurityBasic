package udemy.SpringSecurityBasic.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import udemy.SpringSecurityBasic.model.Contact;


@Repository
public interface ContactRepository extends CrudRepository<Contact, Long> {
	
	
}
