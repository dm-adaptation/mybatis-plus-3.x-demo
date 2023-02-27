package org.example.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.example.entity.UserEntity;

import java.util.List;
import java.util.Map;

public interface UserService extends IService<UserEntity> {
//     List<UserEntity> selectUserEntity();

     Map<String, Integer> selectUserEntity();
}
