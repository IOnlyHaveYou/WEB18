package com.itheima.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.itheima.domain.Product;
import com.itheima.utils.DataSourceUtils;

public class ProductInfoDao {

	public List<Product> findAllProduct() throws SQLException {
		//获得数据库连接
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		//创建数据库语句
		String sql = "select *from product";
		//执行sql语句并把他封装成list集合
		List<Product> productInfoList = runner.query(sql, new BeanListHandler<Product>(Product.class));
		return productInfoList;
	}
	
}
