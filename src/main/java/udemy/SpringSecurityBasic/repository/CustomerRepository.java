package udemy.SpringSecurityBasic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import udemy.SpringSecurityBasic.model.Customer;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    List<Customer> findByEmail(String email);
}
