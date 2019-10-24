package com.syj.springboot.mapper;

import com.syj.springboot.entity.Book;
import org.mapstruct.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author SYJ
 * @description:
 * @date 2019/9/30
 */
@Mapper
public interface BookMapper {

    List<Book> getList();
}
