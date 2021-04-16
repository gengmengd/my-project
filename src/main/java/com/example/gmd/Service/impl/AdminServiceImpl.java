package com.example.gmd.Service.impl;

import com.example.gmd.Mapper.AdminMapper;
import com.example.gmd.Service.AdminService;
import com.example.gmd.entity.Admin;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    @Resource
    private AdminMapper adminMapper;

    @Override
    public List<Admin> queryAdmins(Admin admin) {
        return this.adminMapper.queryAdmins(admin);
    }

    @Override
    public Admin queryAdminById(int adid) {
        return this.adminMapper.queryAdminById(adid);
    }

    @Override
    public Admin login(Admin admin) {
        return this.adminMapper.login(admin);
    }

    @Override
    public int addAdmin(Admin admin) {
        return this.adminMapper.addAdmin(admin);
    }

    @Override
    public int updateAdmin(Admin admin) {
        return this.adminMapper.updateAdmin(admin);
    }

    @Override
    public int deleteAdmin(Admin admin) {
        return this.adminMapper.deleteAdmin(admin);
    }
}
