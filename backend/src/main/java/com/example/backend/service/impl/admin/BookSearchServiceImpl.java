package com.example.backend.service.impl.admin;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.backend.mapper.BookMapper;
import com.example.backend.pojo.Book;
import com.example.backend.service.admin.BookSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BookSearchServiceImpl implements BookSearchService {
    @Autowired
    private BookMapper bookMapper;
    @Override
    public Map<String,Object> searchbook(String standard, String content,boolean ifblur) {
        Map<String,Object>ret=new HashMap<>();
        if(content==null){
            ret.put("message","搜索条件为空");
            return ret;
        }

        QueryWrapper<Book> queryWrapper=new QueryWrapper<>();
        //书名方式提供模糊查找和精确查找两种方式
        if(standard.equals("bookname")){
            if(!ifblur){
                queryWrapper.eq("bookname",content);
                List<Book> booklist=bookMapper.selectList(queryWrapper);
                if(null==booklist) {
                    ret.put("message", "查无此书");
                }
                else{
                    ret.put("message","查找成功");
                    for(Book b:booklist){
                        ret.put("book",b);
                    }
                }
                return ret;
            }
            else{
                queryWrapper.like("bookname",content);
                List<Book> containkeybooks=bookMapper.selectList(queryWrapper);
                System.out.println(containkeybooks);
                if(null==containkeybooks){
                    ret.put("message", "查无此书");
                }
                else{
                    ret.put("message","查找成功1");
                    for(Book b:containkeybooks){
                        ret.put("book"+b.getIsbn(),b);
                    }
                }
                return ret;
            }
        }

        //isbn只有精确查找
        if(standard.equals("isbn")){
            queryWrapper.eq("isbn",content);
            Book b=bookMapper.selectOne(queryWrapper);
            if(null==b){
                ret.put("message", "查无此书");
            }
            else{
                ret.put("message","查找成功");
                ret.put("book",b);
            }
            return ret;
        }

        //风格默认模糊查找
        if(standard.equals("style")){
            queryWrapper.like("style",content);
            List<Book> booklist=bookMapper.selectList(queryWrapper);
            if(null==booklist){
                ret.put("message", "无此类型书籍");
            }
            else{
                ret.put("message","查找成功");
                for(Book b:booklist){
                    ret.put("book"+b.getIsbn(),b);
                }
            }
            return ret;
        }

        ret.put("message","搜索条件选择错误"); //设置成下拉框的情况这里应该不会触发到
        return ret;
    }
}
