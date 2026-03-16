package com.college.lostfound.controller;

import com.college.lostfound.entity.LostItem;
import com.college.lostfound.service.LostItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class LostItemController {

    private final LostItemService service;

    public LostItemController(LostItemService service) {
        this.service = service;
    }

    @PostMapping
    public LostItem addItem(@RequestBody LostItem item) {
        return service.addItem(item);
    }

    @GetMapping
    public List<LostItem> getItems() {
        return service.getAllItems();
    }
}