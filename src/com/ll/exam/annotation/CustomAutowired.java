package com.ll.exam.annotation;

import java.lang.annotation.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;


/* @Retention(RUNTIME) : 런타임 종료시까지 사용
    * RetentionPolicy의 값을 넘겨주는 것으로 어노테이션의 메모리 보유 범위가 결정
 */
/* @Target({ FIELD })
    * 해당 사용자가 만든 어노테이션이 부착될 수 있는 타입을 지정
    * 동작 방식을 보기 위해 간단한 구현만 (field에만 적용)
 */


@Retention(RUNTIME)
@Target({ElementType.FIELD})


public @interface CustomAutowired {

}
