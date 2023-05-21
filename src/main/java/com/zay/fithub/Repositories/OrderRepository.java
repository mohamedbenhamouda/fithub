package com.zay.fithub.Repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.zay.fithub.Entities.Order;

@Repository
public interface OrderRepository extends MongoRepository<Order, Long> {

}
