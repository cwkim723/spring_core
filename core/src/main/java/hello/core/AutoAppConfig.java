package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
        // 스프링으로 등록시키고 싶지 않은 파일을 설정해줌. Configuration은 수동으로 등록시켜 주는데 여기서 또 등록시켜주면 충돌이
        // 나기 때문에 제외시켜줌
)
public class AutoAppConfig {

    /* @ComponentScan
        @Component가 붙은 클래스를 찾아서 자동으로 스프링 빈으로 등록시켜줌
    */
}
