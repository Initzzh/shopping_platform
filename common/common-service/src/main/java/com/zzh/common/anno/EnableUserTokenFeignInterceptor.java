package com.zzh.common.anno;

import com.zzh.common.feign.UserTokenOpenFeignInterceptor;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = ElementType.TYPE)
@Import(value = UserTokenOpenFeignInterceptor.class)
public @interface EnableUserTokenFeignInterceptor {
}
