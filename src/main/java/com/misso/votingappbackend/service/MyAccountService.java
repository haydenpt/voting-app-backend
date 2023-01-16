package com.misso.votingappbackend.service;

import com.misso.votingappbackend.entity.MyAccount;
import com.misso.votingappbackend.repository.MyAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyAccountService {

    @Autowired
    MyAccountRepository myAccountRepository;

//    @Query(nativeQuery = true,
//            name = "findAllMemberInfo")
//    public List<MyAccount> getAllAccountInfo() {
//        return myAccountRepository.findAllMemberInfo();
//    }

    public MyAccount getAccountInfoById(int id) {
        return myAccountRepository.findMyAccountBy(id);
    }
}
