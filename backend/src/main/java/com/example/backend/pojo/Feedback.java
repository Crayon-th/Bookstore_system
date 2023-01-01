package com.example.backend.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("feedback")
public class Feedback {
    @TableField("id")
    private int id;
    @TableField("userid")
    private int userid;
    private String content;
    private Boolean handle;
}
