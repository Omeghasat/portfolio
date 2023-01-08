package com.example.portfolio.customerinforepository;

import com.example.portfolio.model.Customerinfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerinfoRepository extends JpaRepository<Customerinfo, Integer> {

}