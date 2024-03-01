package com.tcs.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.boot.model.Investor;

@Repository
public interface InvestorRepository extends JpaRepository<Investor, Integer> {

}
