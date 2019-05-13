package com.itheima.service;

import java.sql.SQLException;
import java.util.List;

import com.itheima.dao.ProductInfoDao;
import com.itheima.domain.Product;

public class ProductInfoService {


	public List<Product> findAllProduct() throws SQLException {
		//接收dao层数据
				ProductInfoDao dao = new  ProductInfoDao();
				//调用dao层的findAllProduct（）方法
				List<Product> productInfoList = dao.findAllProduct();
		return productInfoList;
	}

	
}
