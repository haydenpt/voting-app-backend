package com.misso.votingappbackend.service;

import com.misso.votingappbackend.repository.MyAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyAccountService {

    @Autowired
    MyAccountRepository myAccountRepository;
}
