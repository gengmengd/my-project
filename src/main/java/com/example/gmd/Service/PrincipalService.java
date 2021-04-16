package com.example.gmd.Service;

import com.example.gmd.entity.Principal;

import java.util.List;

public interface PrincipalService {
    List<Principal> queryPrincipals(Principal principal);
    Principal queryPrincipalsById(int prinid);
    Principal login(Principal principal);
    int addPrincipal(Principal principal);
    int updatePrincipal(Principal principal);
    int deletePrincipal(Principal principal);
}