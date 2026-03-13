package com.emart.inventory.controller;

import com.emart.inventory.model.Item;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class InventoryController {

    @GetMapping("/")
    public String home(Model model) {

        List<Item> items = List.of(
                new Item("Laptop", 10, 85000),
                new Item("Mobile", 25, 30000),
                new Item("Keyboard", 50, 1200),
                new Item("Mouse", 70, 800)
        );

        model.addAttribute("items", items);

        return "inventory";
    }
}