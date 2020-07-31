package com.mapsa.test.controller;

import com.mapsa.test.dao.ProductDao;
import com.mapsa.test.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.List;

/**
 * @author Esmaeil Sadeghi, 7/30/20 2:51 AM
 */
@Controller
public class HomeController {

    @Autowired
    private ProductDao productDao;

    @RequestMapping("/")
    public String home(){
        return "home";
    }

    @RequestMapping("/products")
    public String products(Model model){
        List<Product> products = productDao.getProductList();
        model.addAttribute("products",products);
        return "products";
    }


    @RequestMapping("/product/{id}")
    public String product(@PathVariable Long id, Model model) throws IOException {
        Product product = productDao.getProductById(id);
        model.addAttribute(product);
        return "viewProduct";
    }



}