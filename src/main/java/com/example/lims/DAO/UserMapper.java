package com.example.lims.DAO;

import com.example.lims.POJO.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserMapper extends JpaRepository<User,String>
{

}
