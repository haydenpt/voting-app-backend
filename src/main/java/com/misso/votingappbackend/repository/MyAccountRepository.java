package com.misso.votingappbackend.repository;

import com.misso.votingappbackend.entity.MyAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MyAccountRepository extends JpaRepository<MyAccount, Integer> {
    @Query(nativeQuery = true)
    MyAccount findMyAccountBy(@Param("id") int id);
}
