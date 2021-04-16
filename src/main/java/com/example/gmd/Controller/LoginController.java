package com.example.gmd.Controller;

import com.example.gmd.Service.AdminService;
import com.example.gmd.Service.PrincipalService;
import com.example.gmd.entity.Admin;
import com.example.gmd.entity.Principal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller //作用类似于@WebServlet，这个注解是可以跳转页面的
public class LoginController {
    @Resource
    private AdminService adminService;
    @Resource
    private PrincipalService principalService;
    @RequestMapping("/")
    public String toLogin() {
        //方法的返回类型必须是String。这个String一般就是跳转页面的名称
        return "index";
    }
    @RequestMapping("doLogin")
     public String judge(@RequestParam("num") String num,@RequestParam("pwd") String pwd, @RequestParam("identity") String identity,HttpSession session, ModelMap modelMap){
        if(identity.equals("option1")){
            Admin admin=new Admin(num,pwd);
            System.out.println(admin);
            return this.admindoLogin(admin,session,modelMap);
        }else if(identity.equals("option2")){
            Principal principal=new Principal(num,pwd);
            System.out.println(principal);
            return this.principaldoLogin(principal,session,modelMap);
        }
        return null;

    }
    public String admindoLogin(Admin admin, HttpSession session, ModelMap modelMap){//以管理员身份登录
        String forward="";
        Admin login= this.adminService.login(admin);
            System.out.println(admin);
        if(login!=null){
            System.out.println("管理员登录成功");
            session.setAttribute("admin",login);
            forward="main/main";
        }else {
            System.out.println("denglushibai");
            modelMap.put("msg","对不起，用户名或密码错误！");
            forward="index";
        }
        return forward;
    }
    public String principaldoLogin(Principal principal, HttpSession session, ModelMap modelMap){//以实训负责人身份登录
        String forward="";
        Principal login= this.principalService.login(principal);
        System.out.println(principal);
        if(login!=null){
            System.out.println("管理员登录成功");
            session.setAttribute("principal",login);
            forward="main/main";
        }else {
            modelMap.put("msg","1");
            forward="index";
        }
        return forward;
    }
}
