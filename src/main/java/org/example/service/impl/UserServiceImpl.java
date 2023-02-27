package org.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.entity.UserEntity;
import org.example.mapper.UserMapper;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service()
public class UserServiceImpl extends ServiceImpl<UserMapper, UserEntity>
        implements UserService {
    @Autowired
    private UserMapper userMapper;

//    @Override
//    public List<UserEntity> selectUserEntity() {
//        return userMapper.selectUserEntity();
//    }

    @Override
    public Map<String, Integer> selectUserEntity() {
        return userMapper.selectUserEntity();
    }
}
