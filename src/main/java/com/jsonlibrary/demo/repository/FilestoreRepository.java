package com.jsonlibrary.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jsonlibrary.demo.entities.Filestore;
import com.jsonlibrary.demo.entities.Item;

public interface FilestoreRepository extends CrudRepository<Filestore,Long>{
	List<Item> findByFileId(String fileId);
}
