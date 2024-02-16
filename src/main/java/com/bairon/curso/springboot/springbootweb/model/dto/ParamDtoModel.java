package com.bairon.curso.springboot.springbootweb.model.dto;

public class ParamDtoModel {
    private String message;
    private String saludo;
    private Integer code;

    
    public ParamDtoModel(String message) {
        this.message = message;
    }

    public ParamDtoModel() {
        
    }


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSaludo() {
        return saludo;
    }

    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }

    

    

    
}
