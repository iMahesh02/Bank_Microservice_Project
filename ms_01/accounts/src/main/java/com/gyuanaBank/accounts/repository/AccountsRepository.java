package com.gyuanaBank.accounts.repository;

import com.gyuanaBank.accounts.entity.Accounts;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountsRepository extends JpaRepository<Accounts, Long> {

    Optional <Accounts> findByCustomerId(Long CustomerId);

    /* Now since we will be making changes directly in our databases we need to mention two annotations, viz. @Transactional and
    * @Modifying for our custom methods */

    @Transactional
    @Modifying
    void deleteByCustomerId(Long customerId);
}
