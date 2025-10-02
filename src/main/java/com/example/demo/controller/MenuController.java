package com.example.demo.controller;

import com.example.demo.entity.MenuEntity;
import com.example.demo.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/menus")
public class MenuController {
@Autowired
MenuService menuService;
    @GetMapping("/all")
    public List<MenuEntity> getMenus(){
        return menuService.getAllMenu();
    }
}
