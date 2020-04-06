package com.fang.controller;

import com.fang.domain.Product;
import com.fang.service.impl.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/findAll")
    public ModelAndView findAll()throws Exception{
        ModelAndView mv = new ModelAndView();
        List<Product> pl = productService.findAll();
        mv.addObject("productList",pl);
        mv.setViewName("product-list1");
        return mv;
    }
    @RequestMapping("/save")
    public String saveProduct(Product product)throws Exception{
        productService.saveProduct(product);
        return "redirect:findAll.do";
    }
}
