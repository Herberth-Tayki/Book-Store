package com.kagiya.library_store.controllers;

import java.util.List;

import com.kagiya.library_store.models.Book;
import com.kagiya.library_store.repositorys.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BooksController {
    
    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/searchBook")
    public ModelAndView searchBook(@RequestParam String search){

        ModelAndView mv = new ModelAndView("found-books-page");

        List<Book> foundBooks = bookRepository.findByNameOfBookContaining(search);
        
        mv.addObject("foundBooks", foundBooks);
        
        return mv;
    }

    @RequestMapping("/book")
    public ModelAndView book(@RequestParam String nameOfBook){
        ModelAndView mv = new ModelAndView("book");

        List<Book> book = bookRepository.findByNameOfBookContaining(nameOfBook);

        mv.addObject("books", book);

        return mv;
    }
}
