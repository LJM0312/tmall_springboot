package com.ljm.tmall.dao;
 
import org.springframework.data.jpa.repository.JpaRepository;

import com.ljm.tmall.pojo.Category;

public interface CategoryDAO extends JpaRepository<Category,Integer>{

}
