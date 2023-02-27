package org.example.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("USER_ENTITY")
public class UserEntity {
    int id;
    int case_sensitive;
}
