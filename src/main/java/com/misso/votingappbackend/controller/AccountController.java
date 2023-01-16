package com.misso.votingappbackend.controller;

import com.misso.votingappbackend.entity.MyAccount;
import com.misso.votingappbackend.service.MyAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController()
@RequestMapping("/my-account")
public class AccountController {

    @Autowired
    private MyAccountService myAccountService;

//    @GetMapping("/allMembers")
//    public List<MyAccount> getAllMembers() {
//        return myAccountService.getAllAccountInfo();
//    }

    @GetMapping("/{id}")
    public MyAccount getAllPositions(@PathVariable int id) {
        System.out.println(id);
        System.out.println(SecurityContextHolder.getContext().getAuthentication());
        return myAccountService.getAccountInfoById(id);
    }
}
