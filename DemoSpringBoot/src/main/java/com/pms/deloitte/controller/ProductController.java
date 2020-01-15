package com.pms.deloitte.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pms.deloitte.dao.ProductDAO;
import com.pms.deloitte.model.Product;
import com.pms.deloitte.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	ProductService productService;
	
	@RequestMapping("product")
	public ModelAndView product() {
		ModelAndView view = new ModelAndView("product");
		List<Product> alListProducts=productService.listProducts();
		view.addObject("allProducts", alListProducts);
		view.addObject("product", new Product());
		return view;
	}	
	
	@RequestMapping("saveProduct")
	public ModelAndView saveProduct(Product product) {
		ModelAndView view = new ModelAndView("redirect:/product");
		view.addObject("product", new Product());
		productService.addProduct(product);
		System.out.println(product);
		return view;
	}
	
	@RequestMapping("deleteProduct/{prodId}")
	public ModelAndView deleteProduct(@PathVariable("prodId")Integer productId) {
		productService.deleteProduct(productId);
		ModelAndView view = new ModelAndView("redirect:/product");
		view.addObject("product", new Product());
		return view;
	}
	
	@RequestMapping("editProduct/{prodId}")
	public ModelAndView editProduct(@PathVariable("prodId")Integer productId) {
		System.out.println("###edit product called"+ productId);
		Product product= productService.getProduct(productId);
		ModelAndView view = new ModelAndView("product");
		List<Product> alListProducts=productService.listProducts();
		view.addObject("allProducts", alListProducts);
		view.addObject("product", product);
		return view;
	}
	
	@RequestMapping("/editProduct/add/update")
	public String updateProduct(Product product) {
		this.productService.updateProduct(product);
		return "redirect:/product";
	}
}
