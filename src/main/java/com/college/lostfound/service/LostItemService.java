package com.college.lostfound.service;

import com.college.lostfound.entity.LostItem;
import com.college.lostfound.repository.LostItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LostItemService {

    private final LostItemRepository repository;

    public LostItemService(LostItemRepository repository) {
        this.repository = repository;
    }

    public LostItem addItem(LostItem item) {
        item.setStatus("FOUND");
        return repository.save(item);
    }

    public List<LostItem> getAllItems() {
        return repository.findAll();
    }
}