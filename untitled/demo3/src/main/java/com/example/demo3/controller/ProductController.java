package com.example.demo3.controller;

import com.example.demo3.dto.ProductDto;
import com.example.demo3.service.ProductService;
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

    @PostMapping("addProduct") // ProductService 클래스 안 save 메소드 객체값을 같이 넣어줘야함
    public String addImage(MultipartFile file, ProductDto dto) throws Exception { 
        productService.save(file,dto);
        return "redirect:/";
        







    }





}
