package com.jsonlibrary.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jsonlibrary.demo.entities.Item;

public interface ItemRepository extends CrudRepository<Item,Long>{
	List<Item> findByIsbn(String isbn);
}
