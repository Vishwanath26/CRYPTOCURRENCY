package com.gontuseries.hellocontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.sql.*;

@Controller
public class HelloController {

    @RequestMapping("/welcome")

    public ModelAndView helloWorld() throws ClassNotFoundException, SQLException {

        ModelAndView model = new ModelAndView("HelloPage");
        model.addObject("msg", "Hello World");

        return model;
    }







}
