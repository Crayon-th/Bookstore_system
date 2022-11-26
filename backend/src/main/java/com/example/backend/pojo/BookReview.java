package com.example.backend.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("bookReview")
public class BookReview  implements Comparable<BookReview>{
    @TableId(type= IdType.AUTO)
    private Integer id;
    private String content;
    private String date;
    @TableField("replyID")
    private Integer replyID;
    private Boolean top;
    private String isbn;
    @TableField("targetID")
    private int targetID;

    @Override
    public int compareTo(@NotNull BookReview o) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date1;
        Date date2;
        try {
            date1 = formatter.parse(date);
            date2 = formatter.parse(o.getDate());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return date1.compareTo(date2);
    }
}
