package com.syj.springboot.service;

import com.syj.springboot.entity.Book;

import java.util.List;

/**
 * @author SYJ
 * @description:
 * @date 2019/9/30
 */
public interface IBookService {

    List<Book> getList();
}
