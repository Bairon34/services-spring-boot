package com.bairon.curso.springboot.springbootweb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import com.bairon.curso.springboot.springbootweb.model.dto.ParamDtoModel;


@RestController
@RequestMapping("/api/var")
public class PathVariableController {

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

}
