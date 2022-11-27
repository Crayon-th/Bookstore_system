package com.example.backend.pojo;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Commodity {
    @TableId(type = IdType.AUTO)
    private Integer id;

    private String isbn;

    @TableField("bookName")
    private String bookName;
    @TableField("author")
    private String author;
    @TableField("version")
    private String version;
    @TableField("imageurl")
    private String imageurl;
    @TableField("createTime")
    private String createTime;
    @TableField("damageCondition")
    private String damageCondition;
    @TableField("agingCondition")
    private String agingCondition;
    private float price;
    private Integer uid;

    @TableField("isFinished")
    public boolean isFinished;


    /*
    public Commodity(String isbn,String createTime,String damageCondition,String agingCondition,float price,Integer uid,Book book)
    {
        this.isbn = isbn;
        this.createTime = createTime;
        this.damageCondition = damageCondition;
        this.agingCondition = agingCondition;
        this.price = price;
        this.uid = uid;
        this.book = book;
        this.isFinished = false;
    }
    */
}
