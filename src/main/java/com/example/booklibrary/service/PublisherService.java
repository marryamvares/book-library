package com.example.booklibrary.service;

import com.example.booklibrary.model.Publisher;
import com.example.booklibrary.repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class PublisherService {
    @Autowired
    private PublisherRepository publisherRepository;
    public List<Publisher> listAllPublisher() {
        return publisherRepository.findAll();
    }

    public Publisher savePublisher(Publisher publisher) {
       return publisherRepository.save(publisher);
    }

    public Publisher getPublisher(Integer id) {
        return publisherRepository.findById(id).get();
    }

    public void deletePublisher(Integer id) {
        publisherRepository.deleteById(id);
    }
}
