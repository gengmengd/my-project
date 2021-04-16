package com.example.gmd.Mapper;

import com.example.gmd.entity.Principal;

import java.util.List;

public interface PrincipalMapper {
    List<Principal> queryPrincipals(Principal principal);
    Principal queryPrincipalById(int prinid);
    Principal login(Principal principal);
    int addPrincipal(Principal principal);
    int updatePrincipal(Principal principal);
    int deletePrincipal(Principal principal);
}
