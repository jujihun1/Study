package com.example.demo3.service;


import com.example.demo3.domain.ImageObject;
import com.example.demo3.dto.ProductDto;
import com.example.demo3.repository.ProductRepository;
import org.aspectj.weaver.ast.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.UUID;

@Transactional(readOnly = true) // 읽기전용
@Service
public class ProductService { // 비지니스 로직 (기능에따라 바뀜)


    @Autowired
    private ProductRepository productRepository;

    @Transactional
    public void save(MultipartFile file, ProductDto dto) throws Exception {


        String filePath = System.getProperty("user.dir") // 프로젝트의 주소를 나타냄
                        + "\\src\\main\\resources\\static\\image";

        UUID uuid = UUID.randomUUID();
        String fileName = uuid + "_" + file.getOriginalFilename();

        File saved = new File(filePath,fileName);
        file.transferTo(saved);



        ImageObject product = new ImageObject(
                dto.getContent(),
                dto.getTitle(),
                dto.getCount(),
                dto.getPrice(),
                fileName,
                filePath);

        productRepository.save(product);

    }





}

