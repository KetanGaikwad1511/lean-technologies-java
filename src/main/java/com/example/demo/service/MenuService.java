package com.example.demo.service;

import com.example.demo.entity.MenuEntity;
import com.example.demo.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {

    @Autowired
    MenuRepository menuRepository;
   public List<MenuEntity> getAllMenu(){
       return menuRepository.findAll();
   }
}
