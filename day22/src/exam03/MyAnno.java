package exam03;

import static java.lang.annotation.ElementType.*;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 메타에노테이션 예시
@Target({/*ElementType.*/TYPE, /*ElementType.*/METHOD, /*ElementType.*/FIELD})
@Retention(value = RetentionPolicy.RUNTIME)
public @interface MyAnno {
    String[] value() default {"값1", "값2"};

    int min() default 0;
    int max() default 0;
    
}
