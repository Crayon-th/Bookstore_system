package com.example.backend.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("apply")
public class Apply {
    @TableId(value = "id",type = IdType.AUTO)
    private int id;
    private String isbn;
    private int userid;
    private String bookname;
    private String author;
    private String version;
    private String type;
    private String state;
    private String introduction;
}
