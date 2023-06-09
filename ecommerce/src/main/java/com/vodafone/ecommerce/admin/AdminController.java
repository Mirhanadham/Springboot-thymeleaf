package com.vodafone.ecommerce.admin;


//import com.vodafone.ecommerce.customer.CustomerRegistrationRequest;
//import com.vodafone.ecommerce.jwt.JWTUtil;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Slf4j
@RestController
@RequestMapping("api/v1/admin")
@AllArgsConstructor
public class AdminController {

    private final AdminService adminService;
//    private final JWTUtil jwtUtil;

    @GetMapping(value = "/get",produces = {"application/json"})
    public List<Admin> gatAlladmins(){


//        String jwtToken = jwtUtil.issueToken("ROLE_Admin");
        return  adminService.getAllAdmins();
    }
    @PostMapping(value = "/add",produces = {"application/json"}, consumes = {"application/json"})
    public ResponseEntity<Admin> addAdmin(@RequestBody Admin addedAdmin){
        adminService.addAdmin(addedAdmin);
        return new ResponseEntity<>(HttpStatus.CREATED);

    }

    @DeleteMapping(value = "/delete/{email}", produces = {"application/json"})
    public ResponseEntity<Admin> deleteAdmin(@PathVariable  String email) {
        adminService.deleteAdmin(email);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @PutMapping(value = "/updateAdminEmail/{id}", produces = {"application/json"}, consumes = {"application/json"})
    public ResponseEntity<Admin> updateAdminEmail(@PathVariable Integer id,@RequestBody String email) {
        adminService.updateAdminEmail(id,email);
        return new ResponseEntity<>( HttpStatus.OK);
    }
    @PutMapping(value = "/updateAdminPassword/{id}", produces = {"application/json"}, consumes = {"application/json"})
    public ResponseEntity<Admin> updateAdminPassword(@PathVariable Integer id,@RequestBody String password) {
        adminService.updateAdminPassword(id,password);
        return new ResponseEntity<>( HttpStatus.OK);
    }

}
