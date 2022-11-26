package com.example.backend.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

// 用于获取当下时间
public class timeUtil {
    public String getCurrentTimeStamp()
    {
        TimeZone time = TimeZone.getTimeZone("Etc/GMT-8");  //转换为中国时区
        TimeZone.setDefault(time);
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //pattern里面的大小写不能有误，不然会出现时间不匹配的问题
        Date now = new Date();
        String strDate = sdfDate.format(now);
        return strDate;
    }

}
