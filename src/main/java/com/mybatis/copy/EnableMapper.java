package com.mybatis.copy;

import org.mybatis.spring.annotation.MapperScannerRegistrar;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * Created by dell on 2018/12/24.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import(WangScannerRegistrar.class)
public @interface EnableMapper {
}
