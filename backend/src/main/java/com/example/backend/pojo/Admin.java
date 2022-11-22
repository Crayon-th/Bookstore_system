package com.example.backend.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Admin {
    @TableId(type= IdType.AUTO)
    private Integer id;
    private String adminname;
    private String password;
    private String salt;

    public String getAdminname(){
        return this.adminname;
    }


}
