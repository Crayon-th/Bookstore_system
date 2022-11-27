package com.example.backend.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comment {
    @TableId(type= IdType.AUTO)
    private  Integer id;
    private Float score;
    private String content;
    private String date;
    @TableField("replyID")
    private Integer replyID;
    @TableField("orderID")
    private Integer orderID;

}
