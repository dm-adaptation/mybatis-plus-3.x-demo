package org.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Mapper;
import org.example.entity.UserEntity;

import java.util.List;
import java.util.Map;

@Mapper()
public interface UserMapper extends BaseMapper<UserEntity> {
//    List<UserEntity> selectUserEntity();

    @MapKey("id")
    Map<String, Integer> selectUserEntity();
}
