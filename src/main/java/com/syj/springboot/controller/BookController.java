package com.syj.springboot.controller;

import com.syj.springboot.entity.Book;
import com.syj.springboot.service.IBookService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author SYJ
 * @description:
 * @date 2019/9/30
 */
@RestController
@RequestMapping("/book")
@Api(value = "查询图书列表",tags = "查询图书列表")
public class BookController {
    @Autowired
    private IBookService iBookService;

    @GetMapping("/getList")
    @ApiOperation(value = "获取图书列表",notes = "springboot集成mybatis查询图书列表")
    public List<Book> getList() {
        List<Book> list = iBookService.getList();
        return list;
    }
}
