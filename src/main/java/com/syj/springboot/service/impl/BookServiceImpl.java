package com.syj.springboot.service.impl;

import com.syj.springboot.entity.Book;
import com.syj.springboot.mapper.BookMapper;
import com.syj.springboot.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author SYJ
 * @description: TODO
 * @date 2019/9/30
 */
@Service
public class BookServiceImpl implements IBookService {
    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<Book> getList() {
        return bookMapper.getList();
    }
}
