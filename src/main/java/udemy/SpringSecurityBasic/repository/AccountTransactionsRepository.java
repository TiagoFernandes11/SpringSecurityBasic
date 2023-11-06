package udemy.SpringSecurityBasic.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import udemy.SpringSecurityBasic.model.AccountTransactions;

import java.util.List;

@Repository
public interface AccountTransactionsRepository extends CrudRepository<AccountTransactions, Long> {
	
	List<AccountTransactions> findByCustomerIdOrderByTransactionDtDesc(int customerId);

}
