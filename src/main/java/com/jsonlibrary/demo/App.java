package com.jsonlibrary.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jsonlibrary.demo.entities.Filestore;
import com.jsonlibrary.demo.entities.Item;
import com.jsonlibrary.demo.repository.FilestoreRepository;
import com.jsonlibrary.demo.repository.ItemRepository;

@SpringBootApplication
public class App implements CommandLineRunner {

    @Autowired
    ItemRepository repository;
    
    @Autowired
    FilestoreRepository filestoreRepository;

    public static void main(String[] args) {
        SpringApplication.run(App.class);
    }

    @Override
    public void run(String... strings) throws Exception {
        // save a couple of customers
        repository.save(new Item("Huck Finn","Mark Twain","12345"));
        repository.save(new Item("Adv of Tom Sawyer","Mark Twain","12344"));
        repository.save(new Item("See the Shape","Greg Kim","12333"));
        repository.save(new Item("What is Algebra","Jup Lim","12332"));
        repository.save(new Item("Where are the Cats","Anand Man","12331"));

        // fetch all customers
        System.out.println("Items found with findAll():");
        System.out.println("-------------------------------");
        for (Item customer : repository.findAll()) {
            System.out.println(customer);
        }
        System.out.println();

        // fetch an individual customer by ID
        Item item = repository.findOne(1L);
        System.out.println("Customer found with findOne(1L):");
        System.out.println("--------------------------------");
        System.out.println(item);
        System.out.println();

        // fetch customers by last name
        System.out.println("Item found with findByIsbn('12345'):");
        System.out.println("--------------------------------------------");
        for (Item result : repository.findByIsbn("12345")) {
            System.out.println(result);
        }
        
        Filestore f = new Filestore();
        f.setFileName("fileName2");
        f.setFileID("12345");
        
        filestoreRepository.save(f);

        
    }

}