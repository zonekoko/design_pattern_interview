package com.zyp.design_pattern_interview;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @ClassName Application
 * @Description TODO
 * @Author zhangyanping
 * @Date 2022/5/12 17:09
 * @Version 1.0
 */
@SpringBootApplication
@MapperScan(basePackages = "com.zyp.interview.mapper")
@EnableSwagger2
public class Application {

    public static void main(String[] args) {
        new SpringApplicationBuilder(Application.class)
                .web(WebApplicationType.SERVLET)
                .run(args);
    }
}
