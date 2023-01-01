package com.example.backend.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.models.auth.In;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("complaint")
public class Complaint {
    @TableField("ID")
    private Integer id;
    @TableField("orderID")
    private Integer orderID;
    @TableField("userID")
    private Integer userID;
    private String description;
    private String picurl1;
    private String picurl2;
    @TableField("isFinished")
    private Boolean isFinished;
}
