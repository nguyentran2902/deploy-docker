package com.nguyentran.deploydocker.Reponsitory;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.nguyentran.deploydocker.Entity.Tour;
@Repository
public interface TourReponsitory extends MongoRepository<Tour, ObjectId>{

}
