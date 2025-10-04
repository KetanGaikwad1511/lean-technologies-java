package com.example.demo.controller;

import com.example.demo.entity.MenuEntity;
import com.example.demo.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/menus")
public class MenuController {
@Autowired
MenuService menuService;
    @GetMapping("/all")
    public List<MenuEntity> getMenus(){
        return menuService.getAllMenu();
    }

    @PostMapping("/add")
    public MenuEntity saveMenu( @RequestBody MenuEntity menu){
        return menuService.addData(menu);
    }

}
