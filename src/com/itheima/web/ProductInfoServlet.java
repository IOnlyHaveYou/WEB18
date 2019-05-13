package com.itheima.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itheima.domain.Product;
import com.itheima.service.ProductInfoService;

@WebServlet("/productInfo")
public class ProductInfoServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取商品的名称
		String productid = request.getParameter("productid");
		//获取service层的数据
		ProductInfoService service = new ProductInfoService();
		List<Product> productInfoList = null;
		try {
			 productInfoList = service.findAllProduct();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		for (Product product : productInfoList) {
			if(product.getPid().equals(productid)) {
				//将productInfoList添加到request域中
				request.setAttribute("product", product);
			}
		}
		
		//跳转到product_info.jsp
		request.getRequestDispatcher("/product_info.jsp").forward(request,response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}