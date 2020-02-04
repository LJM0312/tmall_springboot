package com.ljm.tmall.dao;
 
import java.util.List;

import com.ljm.tmall.pojo.ProductImage;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ljm.tmall.pojo.Product;

public interface ProductImageDAO extends JpaRepository<ProductImage,Integer>{
	public List<ProductImage> findByProductAndTypeOrderByIdDesc(Product product, String type);
	
}
