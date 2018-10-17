package com.marshal.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

public class JacksonMapper extends ObjectMapper {
    public JacksonMapper(){
        super();
        SimpleModule responseModule = new SimpleModule();
        responseModule.addSerializer(ResponseData.class,new ResponseDataSerializer());
        this.registerModule(responseModule);
    }
}
