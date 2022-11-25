package com.example.backend.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "用户信息")
@SuperBuilder
@TableName("user")
public class User {
    @TableId(type= IdType.AUTO)
    private Integer id;
    private String username;
    private String password;
    private String email;

    private Boolean enabled;

}
