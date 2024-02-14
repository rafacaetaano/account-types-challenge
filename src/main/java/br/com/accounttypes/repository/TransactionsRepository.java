package br.com.accounttypes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.accounttypes.entity.Transactions;

public interface TransactionsRepository extends JpaRepository<Transactions, Long>{

}
