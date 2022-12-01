package com.example.backend.service.impl.bookApplication;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.backend.mapper.ApplyMapper;
import com.example.backend.mapper.BookMapper;
import com.example.backend.pojo.Apply;
import com.example.backend.pojo.Book;
import com.example.backend.service.bookApplication.ApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ApplyServiceImpl implements ApplyService {

    @Autowired
    private ApplyMapper applyMapper;

    @Autowired
    private BookMapper bookMapper;


    @Override
    public Map<String,String> applyABook(int uid,Book book)
    {
        Map<String,String> m = new HashMap<>();
        Apply apply = new Apply();
        apply.setIsbn(book.getIsbn());
        apply.setUserid(uid);
        apply.setBookname(book.getBookname());
        apply.setAuthor(book.getAuthor());
        apply.setVersion(book.getVersion());
        apply.setType(book.getType());
        apply.setState(book.getState());
        apply.setIntroduction(book.getIntroduction());
        QueryWrapper<Apply> qw2 = new QueryWrapper<>();

        Boolean exist;
        exist = bookMapper.exists(new QueryWrapper<Book>().eq("isbn",book.getIsbn()));
        if (exist)
        {
            m.put("message","书籍已存在");
            return m;
        }
        exist = applyMapper.exists(qw2.eq("isbn",book.getIsbn()).eq("userid",uid));
        if(exist)
        {
            m.put("message","您已经对该书进行过申请，请勿重复操作");
            return m;
        }
        else
        {
            try
            {
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
        Page<Apply> page = new Page<>(current,size);
        QueryWrapper <Apply> queryWrapper = new QueryWrapper<>();
        IPage<Apply> iPage = applyMapper.selectPage(page,null);
        return iPage;
    }

    @Override
    public Map<String,String> handleApplication(Book book)
    {
        Map<String,String> m = new HashMap<>();
        QueryWrapper<Apply> qw1 = new QueryWrapper<>();
        try
        {
            bookMapper.insert(book);
            applyMapper.delete(qw1.eq("isbn",book.getIsbn()));
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
