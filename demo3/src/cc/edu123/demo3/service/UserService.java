package cc.edu123.demo3.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cc.edu123.demo3.mapper.UserMapper;

@Service  
public class UserService {  
  
    @Resource  
    private UserMapper userMapper;  
  
    public String findUserById(int id) {  
        return userMapper.findUserById(id);  
  
    }  
  
}  