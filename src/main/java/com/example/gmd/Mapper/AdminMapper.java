package com.example.gmd.Mapper;

import com.example.gmd.entity.Admin;

import java.util.List;

public interface AdminMapper {
    List<Admin> queryAdmins(Admin admin);
    Admin login(Admin admin);
    int addAdmin(Admin admin);
    int deleteAdmin(Admin admin);
    Admin queryAdminById(int adid);
    int updateAdmin(Admin admin);
}
