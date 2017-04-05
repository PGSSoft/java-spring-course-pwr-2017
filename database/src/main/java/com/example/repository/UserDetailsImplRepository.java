package com.example.repository;

import com.example.entity.UserDetailsImpl;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by piotr on 04.04.17.
 */
public interface UserDetailsImplRepository extends CrudRepository<UserDetailsImpl, Long> {

    UserDetailsImpl findByMail(String mail);

}
