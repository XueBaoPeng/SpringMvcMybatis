package com.xbp.springmybatis.web;

import com.xbp.springmybatis.entity.BookEntity;
import com.xbp.springmybatis.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;

/**
 * @des:
 * @author: 薛宝鹏
 * @date: 2018/5/19 16:36
 */

@Controller()
@RequestMapping("/book")
public class BookController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Resource
    BookService bookService;


    @RequestMapping(value = "/list", method = RequestMethod.GET)
    private String list(Model model) {
        List<BookEntity> list = bookService.getList();
        model.addAttribute("message", list);
        // list.jsp + model = ModelAndView
        return "book/book";// WEB-INF/jsp/"list".jsp
    }

    @RequestMapping(value = "/{bookId}/detail",method = RequestMethod.GET)
    private String detail(@PathVariable("bookId") Long bookId, Model model){
        BookEntity book = bookService.getById(bookId);
        if (book == null) {
            return "forward:/book/entity";
        }
        model.addAttribute("message", book);
        return "book";

    }


}
