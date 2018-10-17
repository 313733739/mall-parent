package com.marshal.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ResponseDataSerializer extends JsonSerializer<ResponseData> implements ContextualSerializer {
    @Override
    public void serialize(ResponseData responseData, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        Map<String,Object> resultMap = new HashMap<>();
        resultMap.put("total",responseData.getTotal());
        resultMap.put("rows",responseData.getRows());
        resultMap.put("seccess",responseData.isSuccess());
        resultMap.put("message",responseData.getMessage());

        jsonGenerator.writeObject(resultMap);
    }

    @Override
    public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) throws JsonMappingException {
        return new ResponseDataSerializer();
    }
}