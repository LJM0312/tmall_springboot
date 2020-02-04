package com.ljm.tmall.dao;
 
import java.util.List;

import com.ljm.tmall.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ljm.tmall.pojo.Order;

public interface OrderDAO extends JpaRepository<Order,Integer>{
    public List<Order> findByUserAndStatusNotOrderByIdDesc(User user, String status);
}
