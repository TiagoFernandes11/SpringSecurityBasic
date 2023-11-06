package udemy.SpringSecurityBasic.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import udemy.SpringSecurityBasic.model.Customer;

import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByEmail(String email);
    
}
