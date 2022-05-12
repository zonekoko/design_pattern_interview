package com.zyp.design_pattern_interview.design_pattern.proxy.config;

import com.zyp.design_pattern_interview.design_pattern.proxy.annotation.TestAnnotation;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @ClassName PersonContainer
 * @Description TODO
 * @Author zhangyanping
 * @Date 2022/5/12 16:45
 * @Version 1.0
 */
@Component
public class PersonContainer<T> {

    public List<T> getAdapterServices(Class<T> tClass){
        Map<String, T> map = SpringContextUtil.getApplicationContext().getBeansOfType(tClass);
        List<T> list = new ArrayList<>();
        if(map != null){
            for (T value : map.values()) {
                list.add(value);
            }
        }
        return list;
    }

    public T getAdapterService(String tag,Class<T> tClass){
        if(tag == null){
            return null;
        }
        List<T> adapterServices = getAdapterServices(tClass);
        for (T adapterService : adapterServices) {
            TestAnnotation annotation = adapterService.getClass().getAnnotation(TestAnnotation.class);
            if(annotation != null && tag.equals(annotation.value().getRole())){
                return adapterService;
            }
        }
        return null;
    }


}
