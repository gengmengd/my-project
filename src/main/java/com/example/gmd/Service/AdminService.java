package com.example.gmd.Service;

import com.example.gmd.entity.Admin;

import java.util.List;

public interface AdminService {
    List<Admin> queryAdmins(Admin admin);
    Admin queryAdminById(int adid);
    Admin login(Admin admin);
    int addAdmin(Admin admin);
    int updateAdmin(Admin admin);
    int deleteAdmin(Admin admin);
}
