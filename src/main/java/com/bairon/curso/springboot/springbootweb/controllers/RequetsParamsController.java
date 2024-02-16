package com.bairon.curso.springboot.springbootweb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bairon.curso.springboot.springbootweb.model.dto.ParamDtoModel;
import com.bairon.curso.springboot.springbootweb.model.dto.ParamMixDtoModel;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api/params")
public class RequetsParamsController {
    
    @GetMapping("/foo")
    public ParamDtoModel foo(@RequestParam(required = false, defaultValue ="hola defoult", name="mensaje") String message,@RequestParam(required = false, defaultValue ="hola defoult", name="saludo") String saludo){

        ParamDtoModel dtoModel = new ParamDtoModel();
        dtoModel.setMessage(message.trim());
        dtoModel.setSaludo(saludo);
        return dtoModel;
    }


    @GetMapping("/bar")
    public ParamMixDtoModel bar(@RequestParam String text, @RequestParam Integer code){

        ParamMixDtoModel dtoModel = new ParamMixDtoModel();
        dtoModel.setCode(code);
        dtoModel.setMessage(text.trim());
        return dtoModel;
    }


    @GetMapping("/barrequets")
    public ParamMixDtoModel requets(HttpServletRequest request){

        Integer code = 0;
        try {
            code = Integer.parseInt(request.getParameter("code"));
        } catch (Exception e) {}

        ParamMixDtoModel dtoModel = new ParamMixDtoModel();
        dtoModel.setCode(code);
        dtoModel.setMessage(request.getParameter("text").trim());
        
        return dtoModel;
    }


}
