package com.example.web;

import com.example.domain.Reader;
import com.example.service.ReaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 描述:
 * controller
 *
 * @author wangyifan
 * @create 2019-01-13 19:05
 */
@RestController
@RequestMapping(value = "/reader")
public class ReaderController {

    @Autowired
    ReaderService readerService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Reader> getReaderlsit(){
        return readerService.finndAll();
    }
    @RequestMapping(value = "/delete",method = RequestMethod.DELETE)
    public Reader deleteReader(@RequestBody Reader reader){
        return readerService.delete(reader);
    }
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public Reader postReader(@RequestBody Reader reader){
        return readerService.insertBook(reader);

    }
    @RequestMapping(value = "/findbyName",method = RequestMethod.GET)
    public Reader findByReader(@RequestBody Reader reader){
        return readerService.findByReader(reader);
    }
    @RequestMapping(value = "",method = RequestMethod.GET)
    public Reader updateReader(@RequestBody Reader reader){
        return readerService.update(reader);
    }



}
