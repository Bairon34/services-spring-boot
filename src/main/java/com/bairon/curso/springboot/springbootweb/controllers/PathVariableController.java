package com.bairon.curso.springboot.springbootweb.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bairon.curso.springboot.springbootweb.model.UserModel;
import com.bairon.curso.springboot.springbootweb.model.dto.ParamDtoModel;


@RestController
@RequestMapping("/api/var")
public class PathVariableController {

    @Value("${config.username}")
    private String username;
    @Value("${config.message}")
    private String message;
    @Value("${config.listOfValues}")
    private String [] listOfValues;
    @Value("${config.code}")
    private Integer code;

    @Value("#{'${config.listOfValues}'.split(',')}")
    private List<String> valueList;

    @Value("#{${config.valuesMap}}")
    private Map<String,Object> valuesMap;

    @Value("#{${config.valuesMap}.product}")
    private String productName;

    @Value("#{${config.valuesMap}.price}")
    private String productPrice;

    @GetMapping("/baz/{message}/{code}/{saludo}")
    public ParamDtoModel baz(@PathVariable String message,@PathVariable Integer code, @PathVariable String saludo){

        ParamDtoModel dtoModel = new ParamDtoModel();

        dtoModel.setMessage(message);
        dtoModel.setCode(code);
        dtoModel.setSaludo(saludo);

        return dtoModel;
    }

    @GetMapping("mix/{id}/{product}")
    public Map<String,Object> mixpathvar(@PathVariable String product, @PathVariable Long id){

        Map<String, Object> json = new HashMap<>();

        json.put("product", product);
        json.put("id", id);

        return json;
    }

    @PostMapping("/create")
    public UserModel create (@RequestBody UserModel userModel){
        userModel.setLastname(userModel.getLastname().toUpperCase());
        return userModel;
    }

    @GetMapping("/config")
    public Map<String, Object> valuesmap(@Value("${config.message}") String message){

        Map<String,Object> json = new HashMap<>();
        
        json.put("username", username);
        json.put("code", code);
        json.put("message", message);
        json.put("lista", listOfValues);
        json.put("listOfValues", valueList);
        json.put("valuesMap", valuesMap);
        json.put("produtName", productName);
        json.put("productPrice", productPrice);

        return  json;
    }

}
