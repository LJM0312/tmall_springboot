package com.ljm.tmall.dao;

import java.util.List;

import com.ljm.tmall.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ljm.tmall.pojo.Order;
import com.ljm.tmall.pojo.OrderItem;
import com.ljm.tmall.pojo.Product;

public interface OrderItemDAO extends JpaRepository<OrderItem,Integer>{
	List<OrderItem> findByOrderOrderByIdDesc(Order order);
	List<OrderItem> findByProduct(Product product);
	List<OrderItem> findByUserAndOrderIsNull(User user);
}
