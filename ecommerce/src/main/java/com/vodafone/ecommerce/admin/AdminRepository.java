package com.vodafone.ecommerce.admin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface AdminRepository extends JpaRepository<Admin, Integer> {

    boolean existsByadminEmail (String email);
    void deleteByadminEmail(String email);
    Admin findByid(Integer ID);
    List <Admin>  findAll();
}
