package com.amos.util.json;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonFactoryBuilder;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.Serializable;
import java.util.List;

/**
 * DESCRIPTION: 参考阿里 fastjson API，使用 jackson 实现
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2020/6/17
 */
public class JSON implements Serializable {

    private static final JsonFactoryBuilder JSON_FACTORY_BUILDER = new JsonFactoryBuilder();


    public static ObjectMapper getObjectMapper() {
        JsonFactory factory = JSON_FACTORY_BUILDER.build();
        factory.enable(JsonParser.Feature.ALLOW_COMMENTS);

        ObjectMapper objectMapper = new ObjectMapper(factory);
        // 处理时间格式 JSR310---JavaTimeModule
        objectMapper.registerModule(new JavaTimeModule());
        objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

        return objectMapper;
    }

    /**
     * 字符串转对象
     *
     * @param text  字符串
     * @param clazz 对象Class
     * @param <T>   对象泛型
     * @return 对象
     */
    public static <T> T parseObject(String text, Class<T> clazz) {
        try {
            return getObjectMapper().readValue(text, clazz);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return null;
    }

    /**
     * 字符串转对象集合
     *
     * @param text 字符串
     * @param <T>  对象泛型
     * @return 对象集合
     */
    public static <T> List<T> parseArray(String text) {
        try {
            return getObjectMapper().readValue(text, new TypeReference<List<T>>() {
            });
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return null;
    }

    /**
     * 对象/对象集合转字符串
     *
     * @param object 对象
     * @return 字符串
     */
    public static String toJSONString(Object object) {
        try {
            return getObjectMapper().writeValueAsString(object);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return null;
    }

}
