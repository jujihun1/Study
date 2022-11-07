package com.example.demo3.controller;

import com.example.demo3.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;


//@RequiredArgsConstructor
@Controller
public class ProductController {

    @Autowired
    private ProductService productService;


    @GetMapping("addProduct") // 링크이름
    public String addProduct(){

        return "addproduct"; // html 이름

    }

    @PostMapping("addProduct")
    public String addImage(MultipartFile file) throws Exception {
        productService.save(file);
        return "redirect:/";

    }





}
