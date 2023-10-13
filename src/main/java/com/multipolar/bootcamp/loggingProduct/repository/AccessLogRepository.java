package com.multipolar.bootcamp.loggingProduct.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.multipolar.bootcamp.loggingProduct.domain.AccessLog;

public interface AccessLogRepository extends MongoRepository<AccessLog, String> {
}
