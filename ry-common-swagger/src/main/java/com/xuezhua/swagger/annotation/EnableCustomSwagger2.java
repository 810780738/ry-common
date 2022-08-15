package com.xuezhua.swagger.annotation;

import org.springframework.context.annotation.Import;
import com.xuezhua.swagger.config.SwaggerAutoConfiguration;

import java.lang.annotation.*;

@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import({ SwaggerAutoConfiguration.class })
public @interface EnableCustomSwagger2
{

}
