package com.nguyentran.deploydocker.Entity;

import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "tour")
public class Tour {

	@Id
	private ObjectId _id;
	private String lang;
	private String name;
	private String describe;
	private Integer slot;
}
