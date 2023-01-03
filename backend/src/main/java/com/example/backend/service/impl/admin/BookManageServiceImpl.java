package com.example.backend.service.impl.admin;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.backend.mapper.BookMapper;
import com.example.backend.mapper.BookReviewMapper;
import com.example.backend.mapper.ScoreMapper;
import com.example.backend.pojo.Book;
import com.example.backend.pojo.Score;
import com.example.backend.service.admin.BookManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BookManageServiceImpl implements BookManageService {
    @Autowired
    private BookMapper bookMapper;
    @Autowired
    private BookReviewMapper bookReviewMapper;
    @Autowired
    private ScoreMapper scoreMapper;

    @Override
    public IPage getallbooks(long current,long size) {
        Page<Book> page = new Page<>(current,size);
        return bookMapper.selectPage(page,null);
    }

    @Override
    public IPage searchbook(String content,long current,long size) {
        Page page = new Page(current,size);
        QueryWrapper<Book> q = new QueryWrapper<>();
        IPage<Book> iPage = bookMapper.selectPage(page,q.like("bookname",content));
        return iPage;
    }

    @Override
    public Map<String,String> editbook(Map<String,String> m){
        Map<String,String> ret=new HashMap<>();
        String isbn=m.get("isbn");
        QueryWrapper<Book> qw=new QueryWrapper<>();
        qw.eq("isbn",isbn);
        Book thisbook=bookMapper.selectOne(qw);
        thisbook.setBookname(m.get("bookname"));
        thisbook.setState(m.get("state"));
        thisbook.setAuthor(m.get("author"));
        thisbook.setType(m.get("type"));
        thisbook.setVersion(m.get("version"));
        thisbook.setIntroduction(m.get("introduction"));
        bookMapper.deleteById(isbn);
        bookMapper.insert(thisbook);

        ret.put("success","editsuccess");
        return ret;
    }

    @Override
    public Map<String,String> addbook(Book book)
    {
        Map<String,String> m =new HashMap<>();
        try{
            bookMapper.insert(book);
            m.put("message","成功添加书籍");
            return m;
        }
        catch (Exception e)
        {
            m.put("message","数据库插入书籍操作失败");
            return m;
        }
    }

    @Override
    public Map<String,String> deletebook(String isbn)
    {
        Map<String,String> m = new HashMap<>();
        QueryWrapper<Book> queryWrapper = new QueryWrapper<>();
        try
        {
            bookMapper.deleteById(isbn);
            m.put("message","书籍删除成功");
            return m;
        }
        catch (Exception e)
        {
            m.put("message","数据库删除书籍失败");
            return m;
        }


    }
    @Override
    public int getScore(String isbn)
    {
        QueryWrapper<Score> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("IFNULL(avg(score),0) as AverageScore")
                .eq("isbn", isbn);
        List<Map<String, Object> >map = scoreMapper.selectMaps(queryWrapper);
        double sumCount = (double) map.get(0).get("AverageScore");
        UpdateWrapper<Book> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("isbn",isbn).set("score", sumCount);
        return bookMapper.update(null, updateWrapper);
    }

}
