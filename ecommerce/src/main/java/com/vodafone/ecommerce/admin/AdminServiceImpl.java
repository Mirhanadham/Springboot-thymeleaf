package com.vodafone.ecommerce.admin;

//import com.vodafone.ecommerce.exception.DuplicateResourceException;
//import com.vodafone.ecommerce.exception.ResourceNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Primary
public class AdminServiceImpl implements AdminService {

    private final AdminRepository adminRepository;
    @Override
    public String addAdmin(Admin adToBeAdded) {
        boolean adminExists = adminRepository.existsByadminEmail(adToBeAdded.getAdminEmail());
        if(adminExists){
//            throw new DuplicateResourceException("Admin already Exists");
        }
        Admin addAdmin =adminRepository.save(adToBeAdded);
        return "admin added successfully";
    }

    @Override
    public String deleteAdmin(String adToBeDeleted) {
        if (!adminRepository.existsByadminEmail(adToBeDeleted)){
//            throw new ResourceNotFoundException("Admin doesn't exist");
        }
        adminRepository.deleteByadminEmail(adToBeDeleted);
        return "Admin deleted";
    }

    @Override
    public String updateAdminPassword(Integer id, String updatedPassword) {
        if(!adminRepository.existsById(id)){
//            throw new ResourceNotFoundException("Admin doesn't exist");
        }
        Admin adminToBeUpdated = adminRepository.findByid(id);
        adminToBeUpdated.setAdminEmail(updatedPassword);
        adminRepository.save(adminToBeUpdated);
        return "Admin password updated";
    }

    @Override
    public String updateAdminEmail(Integer id, String updatedEmail) {
       if(!adminRepository.existsById(id)){
//           throw new ResourceNotFoundException("Admin doesn't exist");
       }
        Admin adminToBeUpdated = adminRepository.findByid(id);
        adminToBeUpdated.setAdminEmail(updatedEmail);
        adminRepository.save(adminToBeUpdated);
        return "Admin email updated";
    }

    @Override
    public boolean login(String username, String Password) {
        return false;
    }

    @Override
    public List<Admin> getAllAdmins() {
        return adminRepository.findAll();
    }

}
