package com.capgemini.shopping.repository;

import com.capgemini.shopping.model.Cart;
import com.capgemini.shopping.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartRepository extends JpaRepository<Cart, Integer> {

    List<Cart> findAllByUserOrderByCreatedDateDesc(User user);
}
