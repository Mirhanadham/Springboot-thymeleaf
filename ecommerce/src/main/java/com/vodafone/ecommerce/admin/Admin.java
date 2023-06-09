package com.vodafone.ecommerce.admin;


import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
public class Admin {
    @Id
    @SequenceGenerator(name = "admin_id_sequence",
            sequenceName = "admin_id_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "admin_id_sequence")
    private Integer id;
    @NotNull
    @Column(name="admin_Email")
    private  String adminEmail;
    @NotNull
    @Column(name="admin_password")
    private String adminPassword;

    public Integer getId() {
        return id;
    }

    public String getAdminEmail() {
        return adminEmail;
    }

    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }
}
