package com.chuyentien.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ChuyenTienController {
    @GetMapping("/chuyentien")
    public ModelAndView showForm() {
        ModelAndView modelAndView = new ModelAndView("chuyentien");
        return modelAndView;
    }

    @PostMapping("/chuyentien")
    public ModelAndView chuyentien(@RequestParam("usd") int usd) {
        ModelAndView modelAndView = new ModelAndView("/chuyentien");
        int vnd = usd * 2300;
        modelAndView.addObject("vnd", vnd);
        return modelAndView;
    }
}
