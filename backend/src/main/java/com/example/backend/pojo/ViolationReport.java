package com.example.backend.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("violationReport")
public class ViolationReport {
    @TableId(type= IdType.AUTO,value = "id")
    private Integer ID;
    @TableField("reportID")
    private Integer reportID;
    @TableField("violationType")
    private String violationType;
    @TableField("violationDescription")
    private String violationDescription;
    private String date;
    @TableField("bookreviewid")
    private Integer bookreviewid;

}
