package com.vodafone.ecommerce.admin;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AdminService {
    public String addAdmin(Admin adToBeAdded);
    public String deleteAdmin(String adToBeDeletedID);
    public String updateAdminPassword(Integer id,String updatedPassword);

    String updateAdminEmail(Integer id, String updatedEmail);

    public boolean login(String username, String Password);
    public List<Admin> getAllAdmins();

}
