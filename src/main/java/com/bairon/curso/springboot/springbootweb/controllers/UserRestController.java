package com.bairon.curso.springboot.springbootweb.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bairon.curso.springboot.springbootweb.model.UserModel;
import com.bairon.curso.springboot.springbootweb.model.dto.UserDtoModel;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/detailslistuser")
    public Map<String,Object> detail(){

        List<UserModel> listUser = new ArrayList<>();

        listUser.add(new UserModel("Bairon", "Imbacuan"));
        listUser.add(new UserModel("Carlos", "Imbacuan"));
        listUser.add(new UserModel("Ramiro", "Imbacuan"));
        listUser.add(new UserModel("Carlos", "Imbacuan"));
        
        Map<String,Object> body = new HashMap<>();
        body.put("User", listUser);

        return body;
    }

    
    @GetMapping("/details-userdto")
    public UserDtoModel detailMap(){
        UserDtoModel userDtoModel = new UserDtoModel();
        UserModel userModel = new UserModel("Andres","castro");
       
       userDtoModel.setUserModel(userModel);
       userDtoModel.setTitle("Hola mundo Spring");

        return userDtoModel;
    }


    @GetMapping("/details-userlist")
    public List<UserModel> list(){

        List<UserModel> userList = new ArrayList<>();

        userList.add(new UserModel("Andres","castro"));
        userList.add(new UserModel("Carlos","castro"));
        userList.add(new UserModel("Lucio","castro"));
       
        return userList;
    }

    


}
