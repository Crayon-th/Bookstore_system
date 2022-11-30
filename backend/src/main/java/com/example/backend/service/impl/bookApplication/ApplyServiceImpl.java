package com.example.backend.service.impl.bookApplication;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.backend.mapper.ApplyMapper;
import com.example.backend.mapper.BookApplicationMapper;
import com.example.backend.mapper.BookMapper;
import com.example.backend.pojo.Apply;
import com.example.backend.pojo.Book;
import com.example.backend.pojo.BookApplication;
import com.example.backend.service.bookApplication.ApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ApplyServiceImpl implements ApplyService {

    @Autowired
    private BookApplicationMapper bookApplicationMapper;
    @Autowired
    private ApplyMapper applyMapper;

    @Autowired
    private BookMapper bookMapper;

    @Override
    public Map<String,String> applyABook(int uid,String isbn,String bookname)
    {
        Map<String,String> m = new HashMap<>();
        BookApplication bookApplication = new BookApplication(isbn,bookname);
        Apply apply = new Apply();
        apply.setIsbn(isbn);
        apply.setUserid(uid);
        QueryWrapper<BookApplication> qw1 = new QueryWrapper<>();
        QueryWrapper<Apply> qw2 = new QueryWrapper<>();

        Boolean exist;
        exist = bookMapper.exists(new QueryWrapper<Book>().eq("isbn",isbn));
        if (exist)
        {
            m.put("message","书籍已存在");
            return m;
        }
        exist = bookApplicationMapper.exists(qw1.eq("isbn",isbn));
        if(exist)
        {
            exist = applyMapper.exists(qw2.eq("userid",uid));
            if(exist)
            {
                m.put("message","您已经对该书进行过申请，请勿重复操作");
                return m;
            }
            else
            {
                try{
                    applyMapper.insert(apply);
                    m.put("message","申请成功");
                    return m;
                }
                catch (Exception e)
                {
                    m.put("message","插入数据库时出错，申请失败");
                    return m;
                }
            }
        }
        else
        {
            try
            {
                bookApplicationMapper.insert(bookApplication);
                applyMapper.insert(apply);
                m.put("message","申请成功");
                return m;
            }
            catch(Exception e)
            {
                m.put("message","插入数据库时出错，申请失败");
                return m;
            }
        }
    }

    @Override
    public IPage getApplication(long current, long size)
    {
        Page<BookApplication> page = new Page<>(current,size);
        QueryWrapper <BookApplication> queryWrapper = new QueryWrapper<>();
        IPage<BookApplication> iPage = bookApplicationMapper.selectPage(page,null);
        return iPage;
    }

    @Override
    public Map<String,String> handleApplication(String isbn)
    {
        Map<String,String> m = new HashMap<>();
        QueryWrapper<BookApplication> qw1 = new QueryWrapper<>();
        try
        {
            bookApplicationMapper.deleteById(isbn);
            m.put("message","处理成功");
            return m;
        }
        catch (Exception e)
        {
            m.put("message","申请请求未能正确处理，请查看数据库解决");
            return m;
        }
    }
}
