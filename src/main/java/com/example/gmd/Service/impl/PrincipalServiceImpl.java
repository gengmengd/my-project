package com.example.gmd.Service.impl;

import com.example.gmd.Mapper.PrincipalMapper;
import com.example.gmd.Service.PrincipalService;
import com.example.gmd.entity.Principal;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PrincipalServiceImpl implements PrincipalService {

    @Resource
    private PrincipalMapper principalMapper;


    @Override
    public List<Principal> queryPrincipals(Principal principal) {
        return null;
    }

    @Override
    public Principal queryPrincipalsById(int prinid) {
        return null;
    }

    @Override
    public Principal login(Principal principal) {
        return this.principalMapper.login(principal);
    }

    @Override
    public int addPrincipal(Principal principal) {
        return 0;
    }

    @Override
    public int updatePrincipal(Principal principal) {
        return 0;
    }

    @Override
    public int deletePrincipal(Principal principal) {
        return 0;
    }
}
