package com.chainsys.application.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class Service {
    @RequestMapping("/welcome")
    public String welcomePage() {
        return "<h1>Welcome</h1>";
    }
    @RequestMapping("/home")
    public String homePage() {
        String html="<div>Google Cloud has opened a region in Delhi's National Capital Region, "
                + "its second site in India. The move follows Google's opening of a Mumbai region in the country back in 2017."
                + " Google used to define regions as consisting of three geographically distinct Google data centers,"
                + " but has gradually loosened its definition</div>";
        return html;
    }
    @RequestMapping("/getdata")
    public String getData(@RequestParam(value="city",defaultValue = "Vellore ")String city) {
        return "<h1>Welcome to "+city+"</h1>";
    }
}