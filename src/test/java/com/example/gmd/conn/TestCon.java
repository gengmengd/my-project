package com.example.gmd.conn;


import com.example.gmd.GmdApplicationTests;
import com.example.gmd.Service.AdminService;
import com.example.gmd.entity.Admin;
import org.junit.Test;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class TestCon extends GmdApplicationTests {

    @Resource
    private DataSource dataSource;
    @Resource
    private AdminService adminService;
    @Test
    public void testConn() throws SQLException {
        Connection connection = this.dataSource.getConnection();
        System.out.println("connection = " + connection);
    }
    @Test
    public  void test1(){
        Admin admin = new Admin("admin", "123");
        Admin login = adminService.login(admin);
        System.out.println(login);
    }
}

