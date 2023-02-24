package com.example.demo.v1.service;

import com.example.demo.v1.dao.MenuDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class MenuService {

    @Autowired
    MenuDao menuDao;

    public List<Map<String, Object>> doList(){

        // Data 만들기, List, Map
        List<Map<String, Object>> list = menuDao.doList();



        return list;
    }
}
