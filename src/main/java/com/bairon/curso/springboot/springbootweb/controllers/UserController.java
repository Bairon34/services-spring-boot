package com.bairon.curso.springboot.springbootweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.ArrayList;
import java.util.List;
import com.bairon.curso.springboot.springbootweb.model.UserModel;

@Controller
public class UserController {

    @GetMapping("/details")
    public String detail(Model model){
        model.addAttribute("title", "hola mundo springboot");
        model.addAttribute("name", "Bairon");
        model.addAttribute("lastname", "Imbacuan");
        return "detail";
    }


    @ModelAttribute("users")
    private List<UserModel> userModel(){

         List<UserModel> userList = new ArrayList<>();
            
         userList.add( new UserModel("Carlos", "Marcos"));
         userList.add( new UserModel("Carlos", "Marcos"));
         userList.add( new UserModel("Carlos", "Marcos"));

        return userList;
    }

}
