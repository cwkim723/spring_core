package hello.core.autowired;

import hello.core.member.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.lang.Nullable;

import java.util.Optional;

public class AutowiredTest {

    @Test
    void AutowiredOption(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(TestBean.class);
    }

    static class TestBean{

        @Autowired(required = false)
        public void setNoBean1(Member noBean1){
            // Member는 스프링 관련 빈이 아님 -> 스프링 컨테이너에 의해 관리되지 않음
            System.out.println("noBean1 = " + noBean1);
            // 출력 자체가 안됨
        }

        @Autowired
        public void setNoBean2(@Nullable Member noBean2){
            System.out.println("noBean2 = " + noBean2);
            // noBean2 = null
        }

        @Autowired
        public void setNoBean3(Optional<Member> noBean3){
            System.out.println("noBean3 = " + noBean3);
            // noBean3 = Optional.empty
        }

    }
}
