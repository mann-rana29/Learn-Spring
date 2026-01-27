package main.app.controllers;

import main.app.model.Product;
import main.app.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @RequestMapping("/products")
    public String viewProducts(Model model){
        var products = productService.findAll();
        model.addAttribute("products",products);

        return "products.html";
    }

    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public String addProduct(Product p , Model model){

        productService.addProduct(p);

        var products = productService.findAll();
        model.addAttribute("products",products);
        return "products.html";
    }
}
