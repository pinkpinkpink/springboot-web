package com.example.service.impl;

import com.example.domain.Reader;
import com.example.service.ReaderService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 描述:
 *
 * @author wangyifan
 * @create 2019-01-13 18:31
 */
public class ReaderServiceImpl implements ReaderService {
    private static Map<String,Reader> Reader_DB = new HashMap<>();


    @Override
    public List<Reader> finndAll() {
        return new ArrayList<>(Reader_DB.values());
    }

    @Override
    public Reader insertBook(Reader reader) {
        reader.setName(Reader_DB.size() + 1L);
        Reader_DB.put(reader.getName(),reader);
        return reader;
    }

    @Override
    public Reader delete(Reader reader) {
        return Reader_DB.remove(reader.getName());
    }

    @Override
    public Reader update(Reader reader) {
        Reader_DB.put(reader.getName(),reader);
        return reader;
    }

    @Override
    public Reader findByReader(Reader reader) {
        return Reader_DB.get(reader);
    }



}
